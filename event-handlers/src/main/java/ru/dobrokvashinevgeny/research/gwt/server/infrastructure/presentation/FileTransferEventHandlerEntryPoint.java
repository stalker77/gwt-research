/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.presentation;

import org.slf4j.*;
import ru.dobrokvashinevgeny.research.gwt.server.infrastructure.ApplicationFileTransferEventHandler;
import ru.dobrokvashinevgeny.research.gwt.server.services.*;
import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.*;

import java.util.*;

/**
 * Класс FileTransferEventHandlerEntryPoint
 */
public class FileTransferEventHandlerEntryPoint implements EventHandler {
	private static final Logger LOG = LoggerFactory.getLogger(FileTransferEventHandlerEntryPoint.class);
	private static final String FILE_NAME = "file1.csv";

	@Override
	public void handle(EventContext eventContext) throws EventHandlerException {
		final ApplicationFileTransferEventHandler application =
			new ApplicationFileTransferEventHandler(
				eventContext.getFileStorageBasePath(),
				eventContext.getJndiDataSourceName());

		final FileTransferService fileTransferService = application.createFileTransferService();
		try {
			fileTransferService.transfer(
				FILE_NAME,
				new TransformerConfig() {
					@Override
					public Map<String, String> getMappings() {
						final HashMap<String, String> mappings = new HashMap<>();
						mappings.put("id", "id");
						mappings.put("name-ts", "name");
						mappings.put("value-ts", "value");
						return mappings;
					}
				},
				new DestDsConfig() {
					@Override
					public String getInsertSql() {
						return "insert into DestTable (id, name, value) values (?, ?, ?)";
					}
				});
		} catch (FileTransferServiceException e) {
			LOG.error("Exception on transfer file " + FILE_NAME + ".", e);
			throw new EventHandlerException(e);
		}
	}
}