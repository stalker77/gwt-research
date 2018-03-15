/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.services;

import ru.dobrokvashinevgeny.research.gwt.server.services.streams.*;

import java.util.*;

/**
 * Класс FileTransferService
 */
public class FileTransferService {
	private static final int ID_COL = 0;
	private static final int NAME_COL = 1;
	private static final int VALUE_COL = 2;
	private final StructuredReadStreamFactory streamFactory;
	private final FileTransferEventHandlerDao eventHandlerDao;
	private final FileTransferEventData eventData;

	public FileTransferService(StructuredReadStreamFactory streamFactory, FileTransferEventHandlerDao eventHandlerDao,
							   FileTransferEventData eventData) {
		this.streamFactory = streamFactory;
		this.eventHandlerDao = eventHandlerDao;
		this.eventData = eventData;
	}

	public void transfer()
		throws FileTransferServiceException {
		try (StructuredReadStream sourceStream = streamFactory.createAsCsv(eventData.getTransferFileName())) {
			while (sourceStream.nextLine()) {
				final List<String> lineData = sourceStream.getLineData();

				final List<String> transformedLineData = transformLineData(lineData);

				eventHandlerDao.save(transformedLineData);
			}
		} catch (Exception e) {
			throw new FileTransferServiceException(e);
		}
	}

	private List<String> transformLineData(List<String> lineData) {
		List<String> result = new ArrayList<>();

		for(int i = 0; i < lineData.size(); i++) {
			String dataElement = lineData.get(i);

			transformDataElement(result, i, dataElement);
		}
		return result;
	}

	private void transformDataElement(List<String> result, int i, String dataElement) {
		switch (i) {
			case ID_COL:
				result.add(dataElement);
				break;
			case NAME_COL:
				result.add(dataElement + " - 12");
				break;
			case VALUE_COL:
				result.add(dataElement);
				break;
		}
	}
}