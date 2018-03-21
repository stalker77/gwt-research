/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure;

import ru.dobrokvashinevgeny.research.gwt.server.infrastructure.persistence.FileTransferEventHandlerDaoImpl;
import ru.dobrokvashinevgeny.research.gwt.server.infrastructure.services.streams.StructuredReadStreamFactoryImpl;
import ru.dobrokvashinevgeny.research.gwt.server.services.*;
import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.*;

/**
 * Класс ApplicationFileTransferEventHandler
 */
public class ApplicationFileTransferEventHandler {
	private final String fileStorageBasePath;
	private final String jndiDataSourceName;
	private final FileTransferEventData eventData;

	public ApplicationFileTransferEventHandler(String fileStorageBasePath, String jndiDataSourceName,
											   EventPayload eventPayload) throws ApplicationEventHandlerException {
		this.fileStorageBasePath = fileStorageBasePath;
		this.jndiDataSourceName = jndiDataSourceName;
		try {
			this.eventData = FileTransferEventData.fromEventPayload(eventPayload);
		} catch (EventPayloadValidationException e) {
			throw new ApplicationEventHandlerException("Exception on unmarshalling eventPayload." , e);
		}
	}

	public FileTransferService createFileTransferService() throws ApplicationEventHandlerException {
		try {
			return new FileTransferService(new StructuredReadStreamFactoryImpl(fileStorageBasePath),
				new FileTransferEventHandlerDaoImpl(jndiDataSourceName), eventData);
		} catch (DaoException e) {
			throw new ApplicationEventHandlerException("Exception on create file transfer service.", e);
		}
	}
}