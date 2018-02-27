/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.service.gin;

import com.google.gwt.inject.client.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.service.*;

/**
 * Класс GinServiceInjectConfig
 */
public class GinServiceInjectConfig extends AbstractGinModule {
	@Override
	protected void configure() {
		bind(UserIdentityForm.class).to(GwtUserIdentityForm.class);
		bind(PresentationContext.class).to(GwtPresentationContext.class);
	}
}