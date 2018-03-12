/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.infrastructure.services.gin;

import com.google.gwt.core.client.GWT;
import ru.dobrokvashinevgeny.research.gwt.client.services.*;

/**
 * Класс PresentationContextImpl
 */
public class GinPresentationContextImpl implements PresentationContext {
	private final ServiceInjector serviceInjector;

	public GinPresentationContextImpl() {
		serviceInjector = GWT.create(ServiceInjector.class);
	}

	@Override
	public DisplayService displayService() {
		return serviceInjector.getDisplayService();
	}

	@Override
	public UserIdentityService userIdentityService() {
		return serviceInjector.getUserIdentityService();
	}
}