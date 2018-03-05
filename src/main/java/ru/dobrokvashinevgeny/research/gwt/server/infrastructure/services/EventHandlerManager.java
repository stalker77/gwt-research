/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.services;

import ru.dobrokvashinevgeny.research.gwt.server.services.EventHandler;

import java.security.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Класс EventHandlerManager
 */
public class EventHandlerManager {
	private final static CopyOnWriteArrayList<EventHandler> registeredEventHandlers = new CopyOnWriteArrayList<>();

	static {
		loadInitialEventHandlers();
	}

	public static EventHandler getEventHandlerByClassName(String eventHandlerClassName)
		throws EventHandlerManagerException {
		for (EventHandler eventHandler : registeredEventHandlers) {
			if (eventHandler.getClass().getName().equals(eventHandlerClassName)) {
				return eventHandler;
			}
		}

		throw new EventHandlerManagerException("No suitable event handler found for " + eventHandlerClassName);
	}

	private static void loadInitialEventHandlers() {
		AccessController.doPrivileged(new PrivilegedAction<Void>() {
			@Override
			public Void run() {
				ServiceLoader<EventHandler> loadedEventHandlers = ServiceLoader.load(EventHandler.class);

				try {
					for (EventHandler eventHandler : loadedEventHandlers) {
						registeredEventHandlers.addIfAbsent(eventHandler);
					}
				} catch(Throwable t) { /*NOP*/ }

				return null;
			}
		});
	}
}