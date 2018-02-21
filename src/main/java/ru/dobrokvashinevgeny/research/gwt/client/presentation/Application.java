/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.presentation;

import ru.dobrokvashinevgeny.research.gwt.client.DomainRegistry;
import ru.dobrokvashinevgeny.research.gwt.client.service.AppService;

/**
 * Класс Application
 */
public class Application {
	private DomainRegistry domainRegistry;

	public AppService createAppService(DomainRegistry domainRegistry) {
		this.domainRegistry = domainRegistry;
		return new AppService();
	}
}