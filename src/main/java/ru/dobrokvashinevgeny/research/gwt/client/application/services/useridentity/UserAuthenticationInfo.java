/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity;

/**
 * Класс UserAuthenticationInfo
 */
public class UserAuthenticationInfo {
	private boolean authenticated;

	public UserAuthenticationInfo(boolean authenticated) {
		this.authenticated = authenticated;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}
}