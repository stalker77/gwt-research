package ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity;

/**
 * Класс UserAuthenticationService
 */
public interface UserAuthenticationService {
	void userAuthenticationFrom(UserIdentityModel userIdentityModel,
								UserAuthenticationReceivedListener receivedListener)
		throws UserAuthenticationServiceException;
}