/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.services;

import ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity.*;

import java.util.logging.*;

/**
 * Класс AppService
 */
public class AppService implements UserIdentityReceivedListener {
	private final static Logger LOG = Logger.getLogger("Main");
	private final UserIdentityService userIdentityService;
	private final DisplayService displayService;

	public AppService(PresentationContext presentationContext) {
		this.displayService = presentationContext.displayService();
		this.userIdentityService = presentationContext.userIdentityService();
	}

	public void receiveUserIdentity() {
		LOG.log(Level.SEVERE, "AppService.receiveUserIdentity() begin");
		UserIdentityViewController userIdentityViewController = userIdentityService.getUserIdentityViewController();
		userIdentityViewController.addUserIdentityReceivedListener(this);
		userIdentityViewController.createView(userIdentityService.getUserIdentityView(userIdentityViewController));
		LOG.log(Level.SEVERE, "AppService.receiveUserIdentity() end");
	}

	@Override
	public void onUserIdentityReceived(UserIdentityModel userIdentityModel) {
		LOG.log(Level.SEVERE, "AppService.onUserIdentityReceived() begin");
		processUserIdentity(userIdentityModel);
		LOG.log(Level.SEVERE, "AppService.onUserIdentityReceived() end");

	}

	private void processUserIdentity(UserIdentityModel userIdentityModel) {
		LOG.log(Level.SEVERE, "AppService.processUserIdentity() begin");
		if (userIdentityModel != null) {
			displayService.showMsg("User name is -" + userIdentityModel.getUserName() +
				"; userPsw is - " + userIdentityModel.getUserPsw());
		}
		LOG.log(Level.SEVERE, "AppService.processUserIdentity() end");
	}

	public void getUserAccessForIdentity(UserIdentityViewModel userIdentity) {
	}

	public void buildPresentation() {
	}

}