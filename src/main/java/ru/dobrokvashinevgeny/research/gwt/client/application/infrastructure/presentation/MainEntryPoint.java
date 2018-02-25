/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation;

import com.google.gwt.core.client.EntryPoint;
import ru.dobrokvashinevgeny.research.gwt.client.application.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.service.AppService;


/**
 * Класс MainEntryPoint
 */
public class MainEntryPoint implements EntryPoint {
	@Override
	public void onModuleLoad() {
		Application application = Applications.fromConfig();
		AppService appService = application.createAppService();
		appService.getUserIdentity();
	}
}