/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.services.eventhandler;

import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.EventContext;

/**
 * Класс EventContextImpl
 */
public class EventContextImpl implements EventContext {
	private final String eventPayload;

	public EventContextImpl(String eventPayload) {
		this.eventPayload = eventPayload;
	}

	@Override
	public String getFileStorageBasePath() {
		return "/upload";
	}

	@Override
	public String getJndiDataSourceName() {
		return "mainDS";
	}

	@Override
	public String getEventPayload() {
		return this.eventPayload;
	}
}