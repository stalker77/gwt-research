/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.infrastructure;

import ru.dobrokvashinevgeny.research.gwt.client.DomainRegistry;
import ru.dobrokvashinevgeny.research.gwt.client.presentation.*;

/**
 * Класс DomainRegistryImpl
 */
public class DomainRegistryImpl implements DomainRegistry {
	@Override
	public PresentationContext getPresentationContext() {
		return new GwtPresentationContext();
	}
}