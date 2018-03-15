package ru.dobrokvashinevgeny.research.gwt.server.services;

import java.util.List;

/**
 * Класс FileTransferEventHandlerDao
 */
public interface FileTransferEventHandlerDao {
	void save(List<String> lineData) throws DaoException;
}