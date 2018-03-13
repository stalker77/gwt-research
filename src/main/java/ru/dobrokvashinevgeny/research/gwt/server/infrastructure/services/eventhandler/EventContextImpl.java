/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.services.eventhandler;

import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.*;
import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.streams.StructuredReadStreamFactory;

/**
 * Класс EventContextImpl
 */
public class EventContextImpl implements EventContext {
	private final StructuredReadStreamFactory streamFactory;

	public EventContextImpl(StructuredReadStreamFactory streamFactory) {
		this.streamFactory = streamFactory;
	}

	@Override
	public StructuredReadStreamFactory getStructuredReadStreamFactory() {
		return this.streamFactory;
	}
}