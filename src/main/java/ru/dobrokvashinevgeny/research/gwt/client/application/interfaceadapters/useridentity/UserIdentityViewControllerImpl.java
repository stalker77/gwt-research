/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.interfaceadapters.useridentity;

import ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity.*;

import java.util.*;
import java.util.logging.*;

/**
 * Класс UserIdentityViewControllerImpl
 */
public class UserIdentityViewControllerImpl implements UserIdentityViewController {
	private final static Logger LOG = Logger.getLogger("Main");
	private List<UserIdentityReceivedListener> onUserIdentityReceivedListeners = new ArrayList<>();

	@Override
	public void createView(UserIdentityView userIdentityView) {
		LOG.log(Level.SEVERE, "UserIdentityViewControllerImpl.createView() begin");
		userIdentityView.create();
		LOG.log(Level.SEVERE, "UserIdentityViewControllerImpl.createView() end");
	}

	@Override
	public void addUserIdentityReceivedListener(UserIdentityReceivedListener listener) {
		onUserIdentityReceivedListeners.add(listener);
	}

	@Override
	public void onUserIdentityReceived(UserIdentityViewModel eventData) {
		LOG.log(Level.SEVERE, "UserIdentityViewControllerImpl.onUserIdentityReceived() begin");
		if (eventData != null) {
			UserIdentityModel userIdentityModel = new UserIdentityModel(eventData.getUserName(), eventData.getUserPsw());
			for (UserIdentityReceivedListener listener : onUserIdentityReceivedListeners) {
				listener.onUserIdentityReceived(userIdentityModel);
			}
		}
		LOG.log(Level.SEVERE, "UserIdentityViewControllerImpl.onUserIdentityReceived() begin");
	}
}