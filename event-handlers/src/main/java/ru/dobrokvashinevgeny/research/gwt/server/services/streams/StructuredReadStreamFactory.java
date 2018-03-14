package ru.dobrokvashinevgeny.research.gwt.server.services.streams;

/**
 * Класс StructuredReadStreamFactory
 */
public interface StructuredReadStreamFactory {
	StructuredReadStream createAsCsv(String streamName) throws StructuredReadStreamException;

	StructuredReadStream createAsXls(String streamName);
}