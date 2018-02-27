package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.service.gin;

import com.google.gwt.inject.client.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.service.*;

/**
 * Класс ServiceInjector
 */
@GinModules(GinServiceInjectConfig.class)
public interface ServiceInjector extends Ginjector {
	UserIdentityForm getUserIdentityForm();

	PresentationContext getPresentationContext();
}