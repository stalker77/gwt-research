package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation;

import ru.dobrokvashinevgeny.research.gwt.client.application.service.UserIdentityViewModel;

/**
 * Класс UserIdentityReceivedListener
 */
public interface UserIdentityReceivedListener {
	void onUserIdentityReceived(UserIdentityViewModel eventData);
}