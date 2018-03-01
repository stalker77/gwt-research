/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.services;

import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.services.*;

/**
 * Класс PresentationContextImpl
 */
public class PresentationContextImpl implements PresentationContext {
	@Override
	public DisplayService displayService() {
		return new GwtDisplayService();
	}

	@Override
	public UserIdentityService userIdentityService() {
		return new GwtUserIdentityService();
	}
}