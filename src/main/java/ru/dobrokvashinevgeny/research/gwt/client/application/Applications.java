/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application;

import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.DomainRegistryImpl;

/**
 * Класс Applications
 */
public class Applications {
//	private final static Logger LOG = Logger.getLogger("Main");

	public static Application fromConfig() {
//		LOG.log(Level.SEVERE, "Application.fromConfig() begin");
		final DomainRegistry domainRegistry = new DomainRegistryImpl();
//		LOG.log(Level.SEVERE, "Application.fromConfig() end");
		return new Application(domainRegistry);
	}
}