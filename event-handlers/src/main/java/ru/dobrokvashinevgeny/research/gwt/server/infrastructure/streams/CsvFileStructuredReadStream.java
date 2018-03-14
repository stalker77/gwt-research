/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.streams;

import ru.dobrokvashinevgeny.research.gwt.server.services.streams.*;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

/**
 * Класс CsvFileStructuredReadStream
 */
public class CsvFileStructuredReadStream implements StructuredReadStream {
	private static final String CSV_COLUMN_SEPARATOR = ",";

	private final BufferedReader fileReader;

	private List<String> lineData;

	public CsvFileStructuredReadStream(String streamName) throws StructuredReadStreamException {
		try {
			fileReader = Files.newBufferedReader(Paths.get(streamName), Charset.forName("UTF-8"));
		} catch (IOException e) {
			throw new StructuredReadStreamException(e);
		}
	}

	@Override
	public boolean nextLine() throws StructuredReadStreamException {
		String lineOfFile;
		try {
			lineOfFile = fileReader.readLine();
		} catch (IOException e) {
			throw new StructuredReadStreamException(e);
		}

		boolean result = lineOfFile != null;
		if (result) {
			parseLine(lineOfFile);
		}

		return result;
	}

	private void parseLine(String fileRow) {
		final String[] splitRowOfFile = fileRow.split(CSV_COLUMN_SEPARATOR);
		this.lineData = Arrays.asList(splitRowOfFile);
	}

	@Override
	public List<String> getLineData() {
		return this.lineData;
	}

	@Override
	public void close() throws Exception {
		try {
			fileReader.close();
		} catch (IOException e) {
			throw new StructuredReadStreamException(e);
		}
	}
}