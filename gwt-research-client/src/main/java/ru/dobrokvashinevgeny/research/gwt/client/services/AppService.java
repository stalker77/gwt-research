/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.services;

import ru.dobrokvashinevgeny.research.gwt.client.services.useridentity.*;

import java.util.logging.*;

/**
 * Класс AppService
 */
public class AppService implements UserIdentityReceivedListener, UserAuthenticationReceivedListener {
	private final static Logger LOG = Logger.getLogger(AppService.class.toString());
	private final UserIdentityService userIdentityService;
	private final DisplayService displayService;
	private final ServicesRegistry servicesRegistry;

	public AppService(PresentationContext presentationContext, ServicesRegistry servicesRegistry) {
		this.displayService = presentationContext.displayService();
		this.userIdentityService = presentationContext.userIdentityService();
		this.servicesRegistry = servicesRegistry;
	}

	public void receiveUserIdentity() {
		LOG.log(Level.SEVERE, "receiveUserIdentity() begin");
		UserIdentityViewController userIdentityViewController = userIdentityService.getUserIdentityViewController();
		userIdentityViewController.addUserIdentityReceivedListener(this);
		userIdentityViewController.createView(userIdentityService.getUserIdentityView(userIdentityViewController));
		LOG.log(Level.SEVERE, "AppService.receiveUserIdentity() end");
	}

	@Override
	public void onUserIdentityReceived(UserIdentityModel userIdentityModel) {
		LOG.log(Level.SEVERE, "onUserIdentityReceived() begin");
		processUserIdentity(userIdentityModel);
		LOG.log(Level.SEVERE, "onUserIdentityReceived() end");

	}

	private void processUserIdentity(UserIdentityModel userIdentityModel) {
		LOG.log(Level.SEVERE, "processUserIdentity() begin");
		if (userIdentityModel != null) {
			displayService.showMsg("User name is -" + userIdentityModel.getUserName() +
				"; userPsw is - " + userIdentityModel.getUserPsw());
			try {
				userAuthenticationService()
					.userAuthenticationFrom(userIdentityModel, this);
			} catch (UserAuthenticationServiceException e) {
//				LOG.log(Level.SEVERE, "");
				displayService.showMsg("User: " + userIdentityModel.getUserName() + " - not authenticated!");
			}

			/*if (userAuthenticationInfo.isAuthenticated()) {
				authorizeAuthenticatedUser(userAuthenticationInfo);
			} else {
				throw new Exception("");
			}*/
		}
		LOG.log(Level.SEVERE, "processUserIdentity() end");
	}

	@Override
	public void onUserAuthenticationReceived(UserAuthenticationInfo userAuthenticationInfo) {
		LOG.log(Level.SEVERE, "onUserAuthenticationReceived() begin");
		displayService.showMsg(userAuthenticationInfo.toString());
		LOG.log(Level.SEVERE, "onUserAuthenticationReceived() end");
	}

	private UserAuthenticationService userAuthenticationService() {
		return servicesRegistry.userAuthenticationService();
	}

	/*private void authorizeAuthenticatedUser(UserAuthenticationInfo userAuthenticationInfo) {
		final UserAuthorizationInfo userAuthorizationInfo =
			userAuthorizationService()
			.userAuthorizationFrom(userAuthenticationInfo);
	}

	private UserAuthorizationService userAuthorizationService() {
		return null;
	}*/

	public void getUserAccessForIdentity(UserIdentityViewModel userIdentity) {
	}

	public void buildPresentation() {
	}
}