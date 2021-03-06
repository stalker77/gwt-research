/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.infrastructure.presentation;

import com.google.gwt.user.client.Window;
import ru.dobrokvashinevgeny.research.gwt.client.services.DisplayService;

/**
 * Класс GwtDisplayService
 */
public class GwtDisplayService implements DisplayService {
	@Override
	public void showMsg(String msgText) {
		Window.alert(msgText);
	}
}