package ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.streams;

/**
 * Класс StructuredReadStream
 */
public class StructuredReadStreamException extends Exception {
	/**
	 * Создает <code>StructuredReadStreamException</code> с указанным
	 * детализирующим сообщением.
	 *
	 * @param message детализирующее сообщение.
	 */
	public StructuredReadStreamException(String message) {
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
	public StructuredReadStreamException(String message, Throwable cause) {
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
	public StructuredReadStreamException(Throwable cause) {
		super(cause);
	}
}