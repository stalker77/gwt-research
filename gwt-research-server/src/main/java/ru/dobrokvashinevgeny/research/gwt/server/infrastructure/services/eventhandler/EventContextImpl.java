/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.services.eventhandler;

import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.*;

/**
 * Класс EventContextImpl
 */
public class EventContextImpl implements EventContext {
	private final EventPayload eventPayload;

	public EventContextImpl(EventPayload eventPayload) {
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
	public EventPayload getEventPayload() {
		return this.eventPayload;
	}
}