/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation;

import ru.dobrokvashinevgeny.research.gwt.client.application.interfaceadapters.useridentity.UserIdentityViewControllerImpl;
import ru.dobrokvashinevgeny.research.gwt.client.application.services.UserIdentityService;
import ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity.*;

/**
 * Класс GwtUserIdentityService
 */
public class GwtUserIdentityService implements UserIdentityService {
	@Override
	public UserIdentityView getUserIdentityView() {
		return new GwtUserIdentityView(getUserIdentityViewController());
	}

	@Override
	public UserIdentityViewController getUserIdentityViewController() {
		return new UserIdentityViewControllerImpl();
	}
}