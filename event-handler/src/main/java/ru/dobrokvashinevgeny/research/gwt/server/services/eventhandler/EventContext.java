/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler;

/**
 * Класс EventContext
 */
public interface EventContext {
	String getFileStorageBasePath();

	String getJndiDataSourceName();

	String getEventPayload();
}