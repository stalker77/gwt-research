/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure;

import ru.dobrokvashinevgeny.research.gwt.client.application.DomainRegistry;
import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.service.*;

/**
 * Класс DomainRegistryImpl
 */
public class DomainRegistryImpl implements DomainRegistry {
	@Override
	public UserIdentityForm getUserIdentityForm() {
		return new GwtUserIdentityForm();
	}

	@Override
	public PresentationContext getPresentationContext() {
		return new GwtPresentationContext();
	}
}