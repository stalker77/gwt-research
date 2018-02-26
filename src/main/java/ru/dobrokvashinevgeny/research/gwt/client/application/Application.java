/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application;

import ru.dobrokvashinevgeny.research.gwt.client.application.service.AppService;

/**
 * Класс Application
 */
public class Application {
//	private final static Logger LOG = Logger.getLogger("Main");

	private DomainRegistry domainRegistry;

	public Application(DomainRegistry domainRegistry) {
		this.domainRegistry = domainRegistry;
	}

	public AppService createAppService() {
//		LOG.log(Level.SEVERE, "Application.createAppService() begin");
		return new AppService(domainRegistry.getPresentationContext(), domainRegistry.getUserIdentityForm());
	}
}