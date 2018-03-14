package ru.dobrokvashinevgeny.research.gwt.server.services.streams;

import java.util.List;

/**
 * Класс StructuredReadStream
 */
public interface StructuredReadStream extends AutoCloseable {
	boolean nextLine() throws StructuredReadStreamException;

	List<String> getLineData();
}