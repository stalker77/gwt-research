/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.infrastructure.presentation;

import ru.dobrokvashinevgeny.research.gwt.client.interfaceadapters.useridentity.UserIdentityViewControllerImpl;
import ru.dobrokvashinevgeny.research.gwt.client.services.UserIdentityService;
import ru.dobrokvashinevgeny.research.gwt.client.services.useridentity.*;

/**
 * Класс GwtUserIdentityService
 */
public class GwtUserIdentityService implements UserIdentityService {
	@Override
	public UserIdentityView getUserIdentityView(UserIdentityViewController viewController) {
		return new GwtUserIdentityView(viewController);
	}

	@Override
	public UserIdentityViewController getUserIdentityViewController() {
		return new UserIdentityViewControllerImpl();
	}
}