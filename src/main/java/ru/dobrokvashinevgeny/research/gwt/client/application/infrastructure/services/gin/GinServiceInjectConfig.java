/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.services.gin;

import com.google.gwt.inject.client.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.services.*;

/**
 * Класс GinServiceInjectConfig
 */
public class GinServiceInjectConfig extends AbstractGinModule {
	@Override
	protected void configure() {
		bind(UserIdentityService.class).to(GwtUserIdentityService.class);
		bind(DisplayService.class).to(GwtDisplayService.class);
	}
}