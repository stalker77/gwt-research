/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.service;

import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation.UserIdentityReceivedListener;

/**
 * Класс AppService
 */
public class AppService implements UserIdentityReceivedListener {
//	private final static Logger LOG = Logger.getLogger("Main");

	private final UserIdentityForm userIdentityForm;
	private final PresentationContext presentationContext;

	public AppService(PresentationContext presentationContext, UserIdentityForm userIdentityForm) {
		this.presentationContext = presentationContext;
		this.userIdentityForm = userIdentityForm;
	}

	public void getUserIdentity() {
//		LOG.log(Level.SEVERE, "AppService.getUserIdentity() begin");
		userIdentityForm.addUserIdentityReceivedListener(this);
		userIdentityForm.show();
//		LOG.log(Level.SEVERE, "AppService.getUserIdentity() end");
	}

	@Override
	public void onUserIdentityReceived(UserIdentityViewModel eventData) {
//		LOG.log(Level.SEVERE, "AppService.onUserIdentityReceived() begin");
		if (eventData != null) {
			presentationContext.showMsg("User name is -" + eventData.getUserName() +
				"; userPsw is - " + eventData.getUserPsw());
		}
//		LOG.log(Level.SEVERE, "AppService.onUserIdentityReceived() end");
	}

	public void getUserAccessForIdentity(UserIdentityViewModel userIdentity) {

	}

	public void buildPresentation() {

	}

}