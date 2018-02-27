/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.service;

import ru.dobrokvashinevgeny.research.gwt.client.application.service.ServiceRegistry;
import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.service.*;

/**
 * Класс ServiceRegistryImpl
 */
public class ServiceRegistryImpl implements ServiceRegistry {
	@Override
	public UserIdentityForm getUserIdentityForm() {
		return new GwtUserIdentityForm();
	}

	@Override
	public PresentationContext getPresentationContext() {
		return new GwtPresentationContext();
	}
}