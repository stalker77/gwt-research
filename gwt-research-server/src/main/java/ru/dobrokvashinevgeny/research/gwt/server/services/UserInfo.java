/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.services;

/**
 * Класс UserInfo
 */
public class UserInfo {
	private final String userName;
	private final String userPsw;

	public UserInfo(String userName, String userPsw) {
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
		return "UserInfo{" +
			"userName='" + userName + '\'' +
			", userPsw='" + userPsw + '\'' +
			'}';
	}
}