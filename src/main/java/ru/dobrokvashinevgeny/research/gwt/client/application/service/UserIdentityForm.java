package ru.dobrokvashinevgeny.research.gwt.client.application.service;

import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation.UserIdentityReceivedListener;

/**
 * Класс UserIdentityForm
 */
public interface UserIdentityForm {
	void addUserIdentityReceivedListener(UserIdentityReceivedListener listener);

	void show();
}