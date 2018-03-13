package ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.streams;

import java.util.List;

/**
 * Класс StructuredReadStream
 */
public interface StructuredReadStream {
	boolean nextLine() throws StructuredReadStreamException;

	List<String> getLineData();
}