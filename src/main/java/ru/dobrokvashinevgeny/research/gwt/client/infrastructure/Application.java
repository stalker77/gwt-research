/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.infrastructure;

import ru.dobrokvashinevgeny.research.gwt.client.services.*;

/**
 * Класс Application
 */
public class Application {
//	private final static Logger LOG = Logger.getLogger("Main");

	private final PresentationContext presentationContext;
	private final ServicesRegistry servicesRegistry;

	public Application(PresentationContext presentationContext, ServicesRegistry servicesRegistry) {
		this.presentationContext = presentationContext;
		this.servicesRegistry = servicesRegistry;
	}

	public AppService createAppService() {
//		LOG.log(Level.SEVERE, "Application.createAppService() begin");
		return new AppService(presentationContext, servicesRegistry);
	}
}