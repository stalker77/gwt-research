/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler;

import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.streams.StructuredReadStreamFactory;

/**
 * Класс EventContext
 */
public interface EventContext {
	StructuredReadStreamFactory getStructuredReadStreamFactory();


}