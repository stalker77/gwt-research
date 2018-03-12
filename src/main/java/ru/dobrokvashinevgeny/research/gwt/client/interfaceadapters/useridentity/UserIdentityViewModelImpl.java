/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.interfaceadapters.useridentity;

import ru.dobrokvashinevgeny.research.gwt.client.services.useridentity.UserIdentityViewModel;

/**
 * Класс UserIdentityViewModelImpl
 */
public class UserIdentityViewModelImpl implements UserIdentityViewModel {
	private final String userName;
	private final String userPsw;

	public UserIdentityViewModelImpl(String userName, String userPsw) {
		this.userName = userName;
		this.userPsw = userPsw;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	@Override
	public String getUserName() {
		return userName;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	@Override
	public String getUserPsw() {
		return userPsw;
	}

	@Override
	public String toString() {
		return "UserIdentityViewModelImpl{" +
			"userName='" + userName + '\'' +
			", userPsw='" + userPsw + '\'' +
			'}';
	}
}