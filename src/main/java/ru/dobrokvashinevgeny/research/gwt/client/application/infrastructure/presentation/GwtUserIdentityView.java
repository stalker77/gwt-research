/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.ui.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.interfaceadapters.useridentity.UserIdentityViewModelImpl;
import ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity.*;

import java.util.logging.*;

/**
 * Класс GwtUserIdentityView
 */
public class GwtUserIdentityView implements UserIdentityView {
	private final static Logger LOG = Logger.getLogger("Main");
	private final FormPanel form;
	private final VerticalPanel formBody;
	private final TextBox userName;
	private final PasswordTextBox userPsw;
	private final DecoratorPanel formBorder;
	private final UserIdentityViewController viewController;

	public GwtUserIdentityView(UserIdentityViewController viewController) {
		this.viewController = viewController;
		form = new FormPanel();
		formBody = new VerticalPanel();
		userName = new TextBox();
		userPsw = new PasswordTextBox();
		formBorder = new DecoratorPanel();
	}

	@Override
	public void create() {
		LOG.log(Level.SEVERE, "GwtUserIdentityView.create() begin");
		init();

		addViewToScreen();
		LOG.log(Level.SEVERE, "GwtUserIdentityView.create() end");
	}

	private void init() {
		setNewFormBody();

		addUserName();

		addUserPsw();

		addOkButton();
	}

	private void setNewFormBody() {
		formBody.setSpacing(10);
		form.setWidget(formBody);
	}

	private void addUserName() {
		userName.setWidth("100");
		userName.setName("userName");
		formBody.add(userName);
	}

	private void addUserPsw() {
		userPsw.setWidth("100");
		userPsw.setName("userPsw");
		formBody.add(userPsw);
	}

	private void addOkButton() {
		formBody.add(new Button("Ok", new ClickHandler() {
			@Override
			public void onClick(ClickEvent clickEvent) {
				formBorder.getElement().getStyle().setDisplay(Style.Display.NONE);

				final UserIdentityViewModel userIdentityViewModel =
					new UserIdentityViewModelImpl(getUserNameValue(), getUserPswValue());
				viewController.onUserIdentityReceived(userIdentityViewModel);
			}
		}));
	}

	/*private void addFormSubmitHandler() {
		form.addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler() {
			@Override
			public void onSubmitComplete(FormPanel.SubmitCompleteEvent event) {
			}
		});
	}*/

	private String getUserNameValue() {
		return userName.getElement().getPropertyString("value");
	}

	private String getUserPswValue() {
		return userPsw.getElement().getPropertyString("value");
	}

	private void addViewToScreen() {
		formBorder.add(form);
		RootPanel.get().add(formBorder);
	}
}