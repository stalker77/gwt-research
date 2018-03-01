/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.presentation;

import com.google.gwt.core.client.EntryPoint;
import ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.services.AppService;


/**
 * Класс MainEntryPoint
 */
public class MainEntryPoint implements EntryPoint {
//	private final static Logger LOG = Logger.getLogger("Main");

	@Override
	public void onModuleLoad() {
//		LOG.log(Level.SEVERE, "MainEntryPoint.onModuleLoad() begin");
		Application application = Applications.fromConfig();
		AppService appService = application.createAppService();
		appService.receiveUserIdentity();
//		LOG.log(Level.SEVERE, "MainEntryPoint.onModuleLoad() end");
	}
}