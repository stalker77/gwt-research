/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.resource;

/**
 * Класс DataResource
 */

import javax.ws.rs.*;

//http://localhost:8080/gwt-research-1.0/rest/test

@Path("/test")
public class DataResource {
	@GET
//	@Produces(MediaType.APPLICATION_JSON + "; " + MediaType.CHARSET_PARAMETER + "=utf-8")
	public String getText() {
		return "Hello from RESTEasy!!!";
	}
}