package ru.dobrokvashinevgeny.research.gwt.client.services;

import ru.dobrokvashinevgeny.research.gwt.client.services.useridentity.UserAuthenticationService;

/**
 * Класс ServicesRegistry
 */
public interface ServicesRegistry {
	UserAuthenticationService userAuthenticationService();
}