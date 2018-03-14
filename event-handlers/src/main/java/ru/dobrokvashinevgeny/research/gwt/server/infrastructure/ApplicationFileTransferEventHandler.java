/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure;

import ru.dobrokvashinevgeny.research.gwt.server.infrastructure.streams.StructuredReadStreamFactoryImpl;
import ru.dobrokvashinevgeny.research.gwt.server.services.FileTransferService;

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

	public FileTransferService createFileTransferService() {
		return new FileTransferService(new StructuredReadStreamFactoryImpl());
	}
}