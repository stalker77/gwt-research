package ru.dobrokvashinevgeny.research.gwt.client.services;

import ru.dobrokvashinevgeny.research.gwt.client.services.useridentity.*;

/**
 * Класс UserIdentityService
 */
public interface UserIdentityService {
	UserIdentityView getUserIdentityView(UserIdentityViewController viewController);

	UserIdentityViewController getUserIdentityViewController();
}