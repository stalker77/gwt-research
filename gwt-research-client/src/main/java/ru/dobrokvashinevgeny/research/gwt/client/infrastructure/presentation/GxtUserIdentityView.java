/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.infrastructure.presentation;

import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.*;
import ru.dobrokvashinevgeny.research.gwt.client.interfaceadapters.useridentity.UserIdentityViewModelImpl;
import ru.dobrokvashinevgeny.research.gwt.client.services.useridentity.*;

import java.util.logging.Logger;

/**
 * Класс GxtUserIdentityView
 */
public class GxtUserIdentityView implements UserIdentityView {
	private final static Logger LOG = Logger.getLogger("Main");

	private final UserIdentityViewController viewController;
	private final FramedPanel framedPanel;
	private final VBoxLayoutContainer layoutContainer;
	private final TextField userName;
	private final PasswordField userPsw;

	public GxtUserIdentityView(UserIdentityViewController viewController) {
		this.viewController = viewController;
		this.framedPanel = new FramedPanel();
		this.layoutContainer = new VBoxLayoutContainer(VBoxLayoutContainer.VBoxLayoutAlign.STRETCH);
		this.userName = new TextField();
		this.userPsw = new PasswordField();
	}

	@Override
	public void create() {
		init();

		addViewToScreen();
	}

	private void init() {
		layoutContainer.add(new FieldLabel(userName, "Логин"));
		layoutContainer.add(new FieldLabel(userPsw, "Пароль"));
		framedPanel.setHeading("Аутентификация");
		framedPanel.add(layoutContainer);
		framedPanel.addButton(new TextButton("Ок", new SelectEvent.SelectHandler() {
			@Override
			public void onSelect(SelectEvent event) {
				final UserIdentityViewModel userIdentityViewModel =
					new UserIdentityViewModelImpl(getUserNameValue(), getUserPswValue());
				viewController.onUserIdentityReceived(userIdentityViewModel);
			}
		}));
	}

	private String getUserNameValue() {
		return userName.getCurrentValue();
	}

	private String getUserPswValue() {
		return userPsw.getCurrentValue();
	}

	private void addViewToScreen() {
		RootPanel.get().add(framedPanel);
	}
}