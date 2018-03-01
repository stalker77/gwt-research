package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.services.gin;

import com.google.gwt.inject.client.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.services.*;

/**
 * Класс ServiceInjector
 */
@GinModules(GinServiceInjectConfig.class)
public interface ServiceInjector extends Ginjector {
	UserIdentityService getUserIdentityService();

	DisplayService getDisplayService();
}