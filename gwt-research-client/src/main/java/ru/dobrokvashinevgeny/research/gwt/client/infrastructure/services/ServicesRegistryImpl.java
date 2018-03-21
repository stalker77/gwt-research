/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.infrastructure.services;

import ru.dobrokvashinevgeny.research.gwt.client.services.ServicesRegistry;
import ru.dobrokvashinevgeny.research.gwt.client.services.useridentity.UserAuthenticationService;

/**
 * Класс ServicesRegistryImpl
 */
public class ServicesRegistryImpl implements ServicesRegistry {
	@Override
	public UserAuthenticationService userAuthenticationService() {
		return new UserAuthenticationServiceImpl();
	}
}