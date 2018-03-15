package ru.dobrokvashinevgeny.research.gwt.server.services;

/**
 * Класс Dao
 */
public class DaoException extends Exception {
	/**
	 * Создает <code>DaoException</code> с указанным
	 * детализирующим сообщением.
	 *
	 * @param message детализирующее сообщение.
	 */
	public DaoException(String message) {
		super(message);
	}

	/**
	 * Создает новое исключение с указанным детализирующим сообщением и
	 * причиной.
	 *
	 * @param message детализирующее сообщение (которое сохраняется для
	 *                дальнейшего получения через {@link Throwable#getMessage()} метод).
	 * @param cause   причина (которое сохраняется для дальнейшего
	 *                получения через {@link Throwable#getCause()} method).
	 *                (Значение <tt>null</tt> является разрешенным, и означает
	 *                что причина несуществует или неизвестна.)
	 */
	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Создает новое исключение с причиной.
	 *
	 * @param cause причина (которое сохраняется для дальнейшего
	 *              получения через {@link Throwable#getCause()} method).
	 *              (Значение <tt>null</tt> является разрешенным, и означает
	 *              что причина несуществует или неизвестна.)
	 */
	public DaoException(Throwable cause) {
		super(cause);
	}
}