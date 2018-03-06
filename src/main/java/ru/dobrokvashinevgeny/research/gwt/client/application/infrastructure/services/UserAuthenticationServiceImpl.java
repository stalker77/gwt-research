/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.services;

import ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity.*;

/**
 * Класс UserAuthenticationServiceImpl
 */
public class UserAuthenticationServiceImpl implements UserAuthenticationService {
	private final UserAuthenticationAdapter userAuthenticationAdapter;

	public UserAuthenticationServiceImpl() {
		this.userAuthenticationAdapter = new UserAuthenticationAdapter();
	}

	@Override
	public void userAuthenticationFrom(UserIdentityModel userIdentityModel,
									   UserAuthenticationReceivedListener receivedListener)
		throws UserAuthenticationServiceException {
		this.userAuthenticationAdapter
			.toUserAuthentication(
				userIdentityModel.getUserName(),
				userIdentityModel.getUserPsw(),
				receivedListener);
	}
}