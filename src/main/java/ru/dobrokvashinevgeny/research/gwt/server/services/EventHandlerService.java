package ru.dobrokvashinevgeny.research.gwt.server.services;

import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.EventContext;

/**
 *  EventHandlerService
 */
public interface EventHandlerService {
	void handleEvent(String eventHandlerClassName, EventContext eventContext) throws EventHandlerServiceException;
}