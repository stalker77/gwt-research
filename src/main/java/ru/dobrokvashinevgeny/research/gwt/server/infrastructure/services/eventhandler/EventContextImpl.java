/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.services.eventhandler;

import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.EventContext;

/**
 * Класс EventContextImpl
 */
public class EventContextImpl implements EventContext {
	@Override
	public String getFileStorageBasePath() {
		return "/upload";
	}

	@Override
	public String getJndiDataSourceName() {
		return "mainDS";
	}
}