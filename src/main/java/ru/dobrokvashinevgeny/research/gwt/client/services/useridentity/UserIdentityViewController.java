package ru.dobrokvashinevgeny.research.gwt.client.services.useridentity;

/**
 * Класс UserIdentityViewController
 */
public interface UserIdentityViewController {
	void createView(UserIdentityView userIdentityView);

	void addUserIdentityReceivedListener(UserIdentityReceivedListener listener);

	void onUserIdentityReceived(UserIdentityViewModel eventData);
}