/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.service;

/**
 * Класс UserIdentityViewModel
 */
public class UserIdentityViewModel {
	private final String userName;
	private final String userPsw;

	public UserIdentityViewModel(String userName, String userPsw) {
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
}