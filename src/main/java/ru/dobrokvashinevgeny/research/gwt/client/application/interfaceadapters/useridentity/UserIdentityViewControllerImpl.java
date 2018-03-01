/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.interfaceadapters.useridentity;

import ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity.*;

import java.util.*;

/**
 * Класс UserIdentityViewControllerImpl
 */
public class UserIdentityViewControllerImpl implements UserIdentityViewController {
	private List<UserIdentityReceivedListener> onUserIdentityReceivedListeners = new ArrayList<>();

	@Override
	public void createView(UserIdentityView userIdentityView) {
		userIdentityView.create();
	}

	@Override
	public void addUserIdentityReceivedListener(UserIdentityReceivedListener listener) {
		onUserIdentityReceivedListeners.add(listener);
	}

	@Override
	public void onUserIdentityReceived(UserIdentityViewModel eventData) {
		if (eventData != null) {
			UserIdentityModel userIdentityModel = new UserIdentityModel(eventData.getUserName(), eventData.getUserPsw());

			for (UserIdentityReceivedListener listener : onUserIdentityReceivedListeners) {
				listener.onUserIdentityReceived(userIdentityModel);
			}
		}
	}
}