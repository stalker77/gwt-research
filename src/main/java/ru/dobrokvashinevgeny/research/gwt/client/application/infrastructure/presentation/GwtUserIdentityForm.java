/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.ui.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.service.*;

import java.util.*;

/**
 * Класс GwtUserIdentityForm
 */
public class GwtUserIdentityForm implements UserIdentityForm {
//	private final static Logger LOG = Logger.getLogger("Main");

	private List<UserIdentityReceivedListener> onUserIdentityReceivedListeners = new ArrayList<>();
	private final FormPanel form;
	private final VerticalPanel formBody;
	private final TextBox userName;
	private final PasswordTextBox userPsw;
	private final DecoratorPanel panel;

	public GwtUserIdentityForm() {
		form = new FormPanel();
		formBody = new VerticalPanel();
		userName = new TextBox();
		userPsw = new PasswordTextBox();
		panel = new DecoratorPanel();
	}

	@Override
	public void addUserIdentityReceivedListener(UserIdentityReceivedListener listener) {
		onUserIdentityReceivedListeners.add(listener);
	}

	@Override
	public void show() {
//		LOG.log(Level.SEVERE, "GwtUserIdentityForm.show() begin");
		setNewFormBody();

		addUserName();

		addUserPsw();

		addOkButton();

		addFormSubmitHandler();

		addFormToScreen();

//		Window.alert("Hello, World!");
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
				panel.getElement().getStyle().setDisplay(Style.Display.NONE);

				final UserIdentityViewModel eventData = new UserIdentityViewModel(getUserNameValue(), getUserPswValue());
				for (UserIdentityReceivedListener listener : onUserIdentityReceivedListeners) {
					listener.onUserIdentityReceived(eventData);
				}
			}
		}));
	}

	private void addFormSubmitHandler() {
		form.addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler() {
			@Override
			public void onSubmitComplete(FormPanel.SubmitCompleteEvent event) {
			}
		});
	}

	private String getUserNameValue() {
		return userName.getElement().getPropertyString("value");
	}

	private String getUserPswValue() {
		return userPsw.getElement().getPropertyString("value");
	}

	private void addFormToScreen() {
		panel.add(form);
		RootPanel.get().add(panel);
	}
}