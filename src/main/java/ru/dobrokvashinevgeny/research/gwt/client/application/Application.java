/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application;

import ru.dobrokvashinevgeny.research.gwt.client.application.service.AppService;

/**
 * Класс Application
 */
public class Application {
	private DomainRegistry domainRegistry;

	public Application(DomainRegistry domainRegistry) {
		this.domainRegistry = domainRegistry;
	}

	public AppService createAppService() {
		return new AppService(domainRegistry.getUserIdentityForm());
	}
}