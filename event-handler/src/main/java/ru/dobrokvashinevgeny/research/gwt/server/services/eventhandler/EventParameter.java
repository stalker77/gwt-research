/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler;

/**
 * Класс EventParameter
 */
public class EventParameter {

	private String name;

	private ParameterType type;

	private String value;

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Устанавливает
	 *
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public ParameterType getType() {
		return type;
	}

	/**
	 * Устанавливает
	 *
	 */
	public void setType(String type) {
		this.type = ParameterType.valueOf(type.trim().toUpperCase());
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Устанавливает
	 *
	 */
	public void setValue(String value) {
		this.value = value;
	}
}