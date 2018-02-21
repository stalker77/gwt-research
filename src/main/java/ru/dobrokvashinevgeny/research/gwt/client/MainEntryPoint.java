/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import ru.dobrokvashinevgeny.research.gwt.client.infrastructure.DomainRegistryImpl;
import ru.dobrokvashinevgeny.research.gwt.client.presentation.*;
import ru.dobrokvashinevgeny.research.gwt.client.service.AppService;

/**
 * Класс MainEntryPoint
 */
public class MainEntryPoint implements EntryPoint {
	@Override
	public void onModuleLoad() {
		Application application = Applications.fromConfig();
		final DomainRegistry domainRegistry = new DomainRegistryImpl();
		PresentationContext presentationContext = domainRegistry.getPresentationContext();
		AppService appService = application.createAppService(domainRegistry);

		appService.buildPresentation();
	}
}