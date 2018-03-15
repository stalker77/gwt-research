/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.streams;

import ru.dobrokvashinevgeny.research.gwt.server.services.streams.*;

/**
 * Класс StructuredReadStreamFactoryImpl
 */
public class StructuredReadStreamFactoryImpl implements StructuredReadStreamFactory {
	private final String fileStorageBasePath;

	public StructuredReadStreamFactoryImpl(String fileStorageBasePath) {
		this.fileStorageBasePath = fileStorageBasePath;
	}

	@Override
	public StructuredReadStream createAsCsv(String streamName) throws StructuredReadStreamException {
		return new CsvFileStructuredReadStream(fileStorageBasePath, streamName);
	}

	@Override
	public StructuredReadStream createAsXls(String streamName) {
		return new XlsFileStructuredReadStream(fileStorageBasePath, streamName);
	}
}