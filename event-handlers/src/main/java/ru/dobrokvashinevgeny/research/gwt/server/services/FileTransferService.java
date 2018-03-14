/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.services;

import ru.dobrokvashinevgeny.research.gwt.server.services.streams.*;

import java.util.List;

/**
 * Класс FileTransferService
 */
public class FileTransferService {
	private final StructuredReadStreamFactory streamFactory;

	public FileTransferService(StructuredReadStreamFactory streamFactory) {
		this.streamFactory = streamFactory;
	}

	public void transfer(String fileName, TransformerConfig transformerConfig, DestDsConfig destDsConfig)
		throws FileTransferServiceException {
		try (StructuredReadStream sourceStream = streamFactory.createAsCsv("" + fileName)) {
			while (sourceStream.nextLine()) {
				final List<String> lineData = sourceStream.getLineData();
				//todo:
				//transform line data

				//send transformed line data to destination data source
			}
		} catch (Exception e) {
			throw new FileTransferServiceException(e);
		}
	}
}