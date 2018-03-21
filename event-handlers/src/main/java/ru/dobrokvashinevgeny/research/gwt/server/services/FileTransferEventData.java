/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.services;

import ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.*;

/**
 * Класс FileTransferEventData
 */
public class FileTransferEventData {
	private static final String TRANSFER_FILE_NAME_PARAM = "transferFileName";
	private String transferFileName;

	public static FileTransferEventData fromEventPayload(EventPayload eventPayload)
		throws EventPayloadValidationException {
		validateEventPayload(eventPayload);

		FileTransferEventData result = new FileTransferEventData();
		EventParameter eventParameter = eventPayload.getParameterByName(TRANSFER_FILE_NAME_PARAM);
		result.setTransferFileName(eventParameter.getValue());
		return result;
	}

	private static void validateEventPayload(EventPayload eventPayload) throws EventPayloadValidationException {
		if (!eventPayload.hasParameter(TRANSFER_FILE_NAME_PARAM, ParameterType.STRING)) {
			throw new EventPayloadValidationException("Event payload validation fail. EventParameter [" +
				TRANSFER_FILE_NAME_PARAM + "] with type [" + ParameterType.STRING.toString() +
				"] not found!");
		}
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public String getTransferFileName() {
		return transferFileName;
	}

	/**
	 * Устанавливает
	 *
	 */
	public void setTransferFileName(String transferFileName) {
		this.transferFileName = transferFileName;
	}
}