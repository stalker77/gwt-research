/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.services;

import ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity.*;

/**
 * Класс UserAuthenticationServiceImpl
 */
public class UserAuthenticationServiceImpl implements UserAuthenticationService {
	private UserAuthenticationAdapter userAuthenticationAdapter;

	@Override
	public UserAuthenticationInfo userAuthenticationFrom(UserIdentityModel userIdentityModel) {
		UserAuthenticationInfo userAuthenticationInfo =
			this.userAuthenticationAdapter
			.toUserAuthentication(
				userIdentityModel.getUserName(),
				userIdentityModel.getUserPsw());

		return userAuthenticationInfo;
	}
}