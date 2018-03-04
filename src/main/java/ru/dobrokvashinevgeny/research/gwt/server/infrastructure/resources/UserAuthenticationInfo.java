/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.resources;

/**
 * Класс UserAuthenticationInfo
 */
public class UserAuthenticationInfo {
	private final String userName;
	private final boolean authenticated;

	public UserAuthenticationInfo(String userName, boolean authenticated) {

		this.userName = userName;
		this.authenticated = authenticated;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public boolean isAuthenticated() {
		return authenticated;
	}

	@Override
	public String toString() {
		return "UserAuthenticationInfo{" +
			"userName='" + userName + '\'' +
			", authenticated=" + authenticated +
			'}';
	}
}