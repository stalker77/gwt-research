/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.services.eventhandler;

import ru.dobrokvashinevgeny.research.gwt.server.services.*;
import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.*;

/**
 * Класс SlEventHandlerService
 */
public class SlEventHandlerService implements EventHandlerService {
	@Override
	public void handleEvent(String eventHandlerClassName, EventContext eventContext) throws EventHandlerServiceException {
		try {
			EventHandler eventHandler = EventHandlerManager.getEventHandlerByClassName(eventHandlerClassName);
			eventHandler.handle(eventContext);
		} catch (EventHandlerManagerException e) {
			throw new EventHandlerServiceException("Event handler class not found: " + eventHandlerClassName, e);
		} catch (EventHandlerException e) {
			throw new EventHandlerServiceException("Exception in event handler.", e);
		}
	}
}