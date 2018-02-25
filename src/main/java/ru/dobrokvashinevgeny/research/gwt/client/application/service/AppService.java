/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.service;

import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation.UserIdentityReceivedListener;

/**
 * Класс AppService
 */
public class AppService implements UserIdentityReceivedListener {
	private UserIdentityForm userIdentityForm;

	public AppService(UserIdentityForm userIdentityForm) {
		this.userIdentityForm = userIdentityForm;
	}

	public void getUserIdentity() {
		userIdentityForm.addUserIdentityReceivedListener(this);
		userIdentityForm.show();
	}

	@Override
	public void onUserIdentityReceived(UserIdentityViewModel eventData) {
		if (eventData != null) {
			eventData.getUserName();
		}
	}

	public void getUserAccessForIdentity(UserIdentityViewModel userIdentity) {
		
	}

	public void buildPresentation() {

	}

}