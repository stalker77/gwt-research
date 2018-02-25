/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application;

import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.DomainRegistryImpl;

/**
 * Класс Applications
 */
public class Applications {
	public static Application fromConfig() {
		final DomainRegistry domainRegistry = new DomainRegistryImpl();
		return new Application(domainRegistry);
	}
}