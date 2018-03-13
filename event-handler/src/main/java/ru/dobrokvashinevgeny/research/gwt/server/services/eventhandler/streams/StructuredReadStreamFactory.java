package ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler.streams;

/**
 * Класс StructuredReadStreamFactory
 */
public interface StructuredReadStreamFactory {
	StructuredReadStream createAsCsv(String streamName) throws StructuredReadStreamException;

	StructuredReadStream createAsXls(String streamName);
}