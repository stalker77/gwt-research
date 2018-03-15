/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure;

import ru.dobrokvashinevgeny.research.gwt.server.infrastructure.persistence.FileTransferEventHandlerDaoImpl;
import ru.dobrokvashinevgeny.research.gwt.server.infrastructure.streams.StructuredReadStreamFactoryImpl;
import ru.dobrokvashinevgeny.research.gwt.server.services.*;

/**
 * Класс ApplicationFileTransferEventHandler
 */
public class ApplicationFileTransferEventHandler {
	private final String fileStorageBasePath;
	private final String jndiDataSourceName;

	public ApplicationFileTransferEventHandler(String fileStorageBasePath, String jndiDataSourceName) {
		this.fileStorageBasePath = fileStorageBasePath;
		this.jndiDataSourceName = jndiDataSourceName;
	}

	public FileTransferService createFileTransferService() throws ApplicationEventHandlerException {
		try {
			return new FileTransferService(new StructuredReadStreamFactoryImpl(fileStorageBasePath),
				new FileTransferEventHandlerDaoImpl(jndiDataSourceName));
		} catch (DaoException e) {
			throw new ApplicationEventHandlerException(e);
		}
	}
}