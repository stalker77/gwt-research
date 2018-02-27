/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application;

import ru.dobrokvashinevgeny.research.gwt.client.application.service.*;

/**
 * Класс Application
 */
public class Application {
//	private final static Logger LOG = Logger.getLogger("Main");

	private ServiceRegistry serviceRegistry;

	public Application(ServiceRegistry serviceRegistry) {
		this.serviceRegistry = serviceRegistry;
	}

	public AppService createAppService() {
//		LOG.log(Level.SEVERE, "Application.createAppService() begin");
		return new AppService(serviceRegistry.getPresentationContext(), serviceRegistry.getUserIdentityForm());
	}
}