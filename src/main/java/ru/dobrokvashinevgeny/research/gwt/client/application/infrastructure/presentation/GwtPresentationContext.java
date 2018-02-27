/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation;

import com.google.gwt.user.client.Window;
import ru.dobrokvashinevgeny.research.gwt.client.application.service.PresentationContext;

/**
 * Класс GwtPresentationContext
 */
public class GwtPresentationContext implements PresentationContext {
//	private final static Logger LOG = Logger.getLogger("Main");

	@Override
	public void showMsg(String msgText) {
//		LOG.log(Level.SEVERE, "GwtPresentationContext.showMsg() begin");
		Window.alert(msgText);
//		LOG.log(Level.SEVERE, "GwtPresentationContext.showMsg() end");
	}
}