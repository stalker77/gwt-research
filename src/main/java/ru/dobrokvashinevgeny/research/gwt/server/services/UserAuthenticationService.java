/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.services;

import ru.dobrokvashinevgeny.research.gwt.server.infrastructure.resources.UserAuthenticationInfo;

/**
 * Класс UserAuthenticationService
 */
public class UserAuthenticationService {
	public UserAuthenticationInfo authenticate(UserInfo userInfo) {
		boolean isAuthenticated = true;
		return new UserAuthenticationInfo(userInfo.getUserName(), isAuthenticated);
	}
}