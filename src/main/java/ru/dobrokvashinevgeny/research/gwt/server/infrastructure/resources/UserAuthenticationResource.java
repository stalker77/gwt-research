/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.resources;

import ru.dobrokvashinevgeny.research.gwt.server.services.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Класс UserAuthenticationResource
 */
@Path("/authentication")
public class UserAuthenticationResource {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public UserAuthenticationInfo authenticateUser(String userName, String userPsw) {
		UserAuthenticationService authenticationService = new UserAuthenticationService();
		return authenticationService.authenticate(new UserInfo(userName, userPsw));
	}
}