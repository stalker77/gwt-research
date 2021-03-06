/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.infrastructure;

import ru.dobrokvashinevgeny.research.gwt.client.infrastructure.services.ServicesRegistryImpl;
import ru.dobrokvashinevgeny.research.gwt.client.infrastructure.services.gin.GinPresentationContextImpl;
import ru.dobrokvashinevgeny.research.gwt.client.services.*;

/**
 * Класс Applications
 */
public class Applications {
//	private final static Logger LOG = Logger.getLogger("Main");

	public static Application fromConfig() {
//		LOG.log(Level.SEVERE, "Application.fromConfig() begin");
//		final UserIdentityService presentationContext = new PresentationContextImpl();
		final PresentationContext presentationContext = new GinPresentationContextImpl();
		final ServicesRegistry servicesRegistry = new ServicesRegistryImpl();
//		LOG.log(Level.SEVERE, "Application.fromConfig() end");
		return new Application(presentationContext, servicesRegistry);
	}
}