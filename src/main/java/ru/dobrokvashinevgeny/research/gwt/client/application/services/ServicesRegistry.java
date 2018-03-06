package ru.dobrokvashinevgeny.research.gwt.client.application.services;

import ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity.UserAuthenticationService;

/**
 * Класс ServicesRegistry
 */
public interface ServicesRegistry {
	UserAuthenticationService userAuthenticationService();
}