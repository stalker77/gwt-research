/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity;

/**
 * Класс UserIdentityModel
 */
public class UserIdentityModel {
	private final String userName;
	private final String userPsw;

	public UserIdentityModel(String userName, String userPsw) {
		this.userName = userName;
		this.userPsw = userPsw;
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
	public String getUserPsw() {
		return userPsw;
	}

	@Override
	public String toString() {
		return "UserIdentityModel{" +
			"userName='" + userName + '\'' +
			", userPsw='" + userPsw + '\'' +
			'}';
	}
}