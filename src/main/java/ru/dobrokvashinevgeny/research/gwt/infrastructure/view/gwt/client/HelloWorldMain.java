/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.infrastructure.view.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

/**
 * Класс HelloWorldMain
 */
public class HelloWorldMain implements EntryPoint {
	@Override
	public void onModuleLoad() {
		Window.alert("Hello, World!");
	}
}