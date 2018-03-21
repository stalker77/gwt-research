package ru.dobrokvashinevgeny.research.gwt.client.services.useridentity;

/**
 * Класс UserAuthenticationService
 */
public interface UserAuthenticationService {
	void userAuthenticationFrom(UserIdentityModel userIdentityModel,
								UserAuthenticationReceivedListener receivedListener)
		throws UserAuthenticationServiceException;
}