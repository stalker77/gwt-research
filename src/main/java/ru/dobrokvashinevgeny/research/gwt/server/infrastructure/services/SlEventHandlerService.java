/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.services;

import ru.dobrokvashinevgeny.research.gwt.server.services.*;

/**
 * Класс SlEventHandlerService
 */
public class SlEventHandlerService implements EventHandlerService {
	@Override
	public void handleEvent(String eventHandlerClassName, Object eventContext) throws EventHandlerServiceException {
		try {
			EventHandler eventHandler = EventHandlerManager.getEventHandlerByClassName(eventHandlerClassName);
			eventHandler.run(eventContext);
		} catch (EventHandlerManagerException e) {
			throw new EventHandlerServiceException("Event handler class not found: " + eventHandlerClassName, e);
		}
	}
}