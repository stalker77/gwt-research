package ru.dobrokvashinevgeny.research.gwt.client.application.services;

import ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity.*;

/**
 * Класс UserIdentityService
 */
public interface UserIdentityService {
	UserIdentityView getUserIdentityView(UserIdentityViewController viewController);

	UserIdentityViewController getUserIdentityViewController();
}