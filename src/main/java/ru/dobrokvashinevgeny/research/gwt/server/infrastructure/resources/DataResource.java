/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.resources;

/**
 * Класс DataResource
 */

import ru.dobrokvashinevgeny.research.gwt.server.services.DataService;

import javax.ws.rs.*;

//http://localhost:8080/gwt-research-1.0/rest/test

@Path("/test")
public class DataResource {
	@GET
//	@Produces(MediaType.APPLICATION_JSON + "; " + MediaType.CHARSET_PARAMETER + "=utf-8")
	public String getText() {
		DataService dataService = new DataService();
		return dataService.getHelloString();
	}
}