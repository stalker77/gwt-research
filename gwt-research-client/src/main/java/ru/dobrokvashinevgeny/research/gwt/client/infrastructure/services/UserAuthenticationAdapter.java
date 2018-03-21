/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.infrastructure.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.*;
import com.google.gwt.json.client.*;
import ru.dobrokvashinevgeny.research.gwt.client.services.useridentity.*;

import java.util.logging.*;

/**
 * Класс UserAuthenticationAdapter
 */
public class UserAuthenticationAdapter {
	private static final Logger LOG = Logger.getLogger(UserAuthenticationAdapter.class.getName());

	public void toUserAuthentication(String userName, String userPsw,
													   final UserAuthenticationReceivedListener receivedListener)
		throws UserAuthenticationServiceException {
		LOG.log(Level.SEVERE, "toUserAuthentication begin");
		RequestBuilder request = new RequestBuilder(RequestBuilder.POST,
												GWT.getHostPageBaseURL() + "rest/authentication");
		try {
			request.setHeader("Content-type", "application/json");
			request.sendRequest(toJsonUserIdentity(userName, userPsw).toString(), new RequestCallback() {
				@Override
				public void onResponseReceived(Request request, Response response) {
					LOG.log(Level.SEVERE, "onResponseReceived begin");
					if (response.getStatusCode() == Response.SC_OK) {
						receivedListener.onUserAuthenticationReceived(toUserAuthenticationInfo(response.getText()));
					}
					LOG.log(Level.SEVERE, "onResponseReceived end");
				}

				@Override
				public void onError(Request request, Throwable exception) {

				}
			});
		} catch (RequestException e) {
			throw new UserAuthenticationServiceException("", e);
		}

		LOG.log(Level.SEVERE, "toUserAuthentication end");
	}

	private JSONObject toJsonUserIdentity(String userName, String userPsw) {
		JSONObject jsonUserIdentity = new JSONObject();
		jsonUserIdentity.put("UserName", new JSONString(userName));
		jsonUserIdentity.put("UserPsw", new JSONString(userPsw));
		return jsonUserIdentity;
	}

	private UserAuthenticationInfo toUserAuthenticationInfo(String responseText) {
		JSONValue jsonValue = JSONParser.parseStrict(responseText);
		JSONObject jsonObject = jsonValue.isObject();
		return new UserAuthenticationInfo(jsonObject.get("authenticated").isBoolean().booleanValue());
	}
}