/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.streams;

import ru.dobrokvashinevgeny.research.gwt.server.services.streams.StructuredReadStream;

import java.util.List;

/**
 * Класс XlsFileStructuredReadStream
 */
public class XlsFileStructuredReadStream implements StructuredReadStream {
	public XlsFileStructuredReadStream(String fileStorageBasePath, String streamName) {
	}

	@Override
	public boolean nextLine() {
		return false;
	}

	@Override
	public List<String> getLineData() {
		return null;
	}

	@Override
	public void close() throws Exception {

	}
}