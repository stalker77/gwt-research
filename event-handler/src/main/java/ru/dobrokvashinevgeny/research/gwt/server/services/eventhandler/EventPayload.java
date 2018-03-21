/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.services.eventhandler;

import java.util.List;

/**
 * Класс EventPayload
 */
public class EventPayload {
	private List<EventParameter> parameters;

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public List<EventParameter> getParameters() {
		return parameters;
	}

	/**
	 * Устанавливает
	 *
	 */
	public void setParameters(List<EventParameter> parameters) {
		this.parameters = parameters;
	}

	public EventParameter getParameterByName(String parameterName) {
		for (EventParameter eventParameter : parameters) {
			if (eventParameter.getName().equals(parameterName)) {
				return eventParameter;
			}
		}

		return null;
	}

	public boolean hasParameter(String parameterName, ParameterType parameterType) {
		for (EventParameter eventParameter : parameters) {
			if (eventParameter.getName().equals(parameterName) &&
				eventParameter.getType() == parameterType) {
				return true;
			}
		}
		return false;
	}
}