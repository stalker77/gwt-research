/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure;

import ru.dobrokvashinevgeny.research.gwt.client.application.services.*;

/**
 * Класс Application
 */
public class Application {
//	private final static Logger LOG = Logger.getLogger("Main");

	private PresentationContext presentationContext;

	public Application(PresentationContext presentationContext) {
		this.presentationContext = presentationContext;
	}

	public AppService createAppService() {
//		LOG.log(Level.SEVERE, "Application.createAppService() begin");
		return new AppService(presentationContext);
	}
}