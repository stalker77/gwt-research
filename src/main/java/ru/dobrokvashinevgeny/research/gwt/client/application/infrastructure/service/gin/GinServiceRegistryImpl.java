/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.service.gin;

import com.google.gwt.core.client.GWT;
import ru.dobrokvashinevgeny.research.gwt.client.application.service.ServiceRegistry;
import ru.dobrokvashinevgeny.research.gwt.client.application.service.*;

/**
 * Класс ServiceRegistryImpl
 */
public class GinServiceRegistryImpl implements ServiceRegistry {
	private final ServiceInjector serviceInjector;

	public GinServiceRegistryImpl() {
		serviceInjector = GWT.create(ServiceInjector.class);
	}

	@Override
	public UserIdentityForm getUserIdentityForm() {
		return serviceInjector.getUserIdentityForm();
	}

	@Override
	public PresentationContext getPresentationContext() {
		return serviceInjector.getPresentationContext();
	}
}