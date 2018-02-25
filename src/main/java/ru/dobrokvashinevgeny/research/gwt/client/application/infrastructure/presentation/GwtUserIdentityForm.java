/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation;

import com.google.gwt.user.client.Window;
import ru.dobrokvashinevgeny.research.gwt.client.application.service.*;

import java.util.*;

/**
 * Класс GwtUserIdentityForm
 */
public class GwtUserIdentityForm implements UserIdentityForm {
	private List<UserIdentityReceivedListener> onUserIdentityReceivedListeners = new ArrayList<>();

	@Override
	public void addUserIdentityReceivedListener(UserIdentityReceivedListener listener) {
		onUserIdentityReceivedListeners.add(listener);
	}

	@Override
	public void show() {
		Window.alert("Hello, World!");

		final UserIdentityViewModel eventData = new UserIdentityViewModel("", "");
		for (UserIdentityReceivedListener listener : onUserIdentityReceivedListeners) {
			listener.onUserIdentityReceived(eventData);
		}
	}
}