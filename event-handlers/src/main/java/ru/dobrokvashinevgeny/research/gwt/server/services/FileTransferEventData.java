/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.services;

/**
 * Класс FileTransferEventData
 */
public class FileTransferEventData {
	private String transferFileName;

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