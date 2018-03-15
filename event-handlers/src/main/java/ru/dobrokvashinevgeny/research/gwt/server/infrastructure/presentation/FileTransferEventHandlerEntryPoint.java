/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.presentation;

import org.slf4j.*;
import ru.dobrokvashinevgeny.research.gwt.server.infrastructure.*;
import ru.dobrokvashinevgeny.research.gwt.server.services.*;
import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.*;

/**
 * Класс FileTransferEventHandlerEntryPoint
 */
public class FileTransferEventHandlerEntryPoint implements EventHandler {
	private static final Logger LOG = LoggerFactory.getLogger(FileTransferEventHandlerEntryPoint.class);

	@Override
	public void handle(EventContext eventContext) throws EventHandlerException {
		final ApplicationFileTransferEventHandler application =
			new ApplicationFileTransferEventHandler(
				eventContext.getFileStorageBasePath(),
				eventContext.getJndiDataSourceName());

		try {
			final FileTransferService fileTransferService = application.createFileTransferService();
			fileTransferService.transfer();
		} catch (FileTransferServiceException e) {
			LOG.error("Exception on transfer file.", e);
			throw new EventHandlerException(e);
		} catch (ApplicationEventHandlerException e) {
			LOG.error("Exception on create file transfer service.", e);
			throw new EventHandlerException(e);
		}
	}
}