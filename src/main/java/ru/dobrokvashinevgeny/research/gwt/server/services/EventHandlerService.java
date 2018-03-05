package ru.dobrokvashinevgeny.research.gwt.server.services;

/**
 *  EventHandlerService
 */
public interface EventHandlerService {
	void handleEvent(String eventHandlerClassName, Object eventContext) throws EventHandlerServiceException;
}