/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application;

import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.service.gin.GinServiceRegistryImpl;
import ru.dobrokvashinevgeny.research.gwt.client.application.service.ServiceRegistry;

/**
 * Класс Applications
 */
public class Applications {
//	private final static Logger LOG = Logger.getLogger("Main");

	public static Application fromConfig() {
//		LOG.log(Level.SEVERE, "Application.fromConfig() begin");
//		final ServiceRegistry serviceRegistry = new ServiceRegistryImpl();
		final ServiceRegistry serviceRegistry = new GinServiceRegistryImpl();
//		LOG.log(Level.SEVERE, "Application.fromConfig() end");
		return new Application(serviceRegistry);
	}
}