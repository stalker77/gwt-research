/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.client.application.infrastructure.services;

import com.google.gwt.http.client.*;
import com.google.gwt.json.client.*;
import ru.dobrokvashinevgeny.research.gwt.client.application.services.useridentity.UserAuthenticationInfo;

/**
 * Класс UserAuthenticationAdapter
 */
public class UserAuthenticationAdapter {
	public UserAuthenticationInfo toUserAuthentication(String userName, String userPsw) {
		UserAuthenticationInfo result = null;
		RequestBuilder request = new RequestBuilder(RequestBuilder.POST, "/rest/authentication");
		try {
			request.setHeader("", "application/json");
			request.sendRequest(toJsonUserIdentity(userName, userPsw).toString(), new RequestCallback() {
				@Override
				public void onResponseReceived(Request request, Response response) {
					if (response.getStatusCode() == Response.SC_OK) {
						toUserAuthenticationInfo(response.getText());
					}
				}

				@Override
				public void onError(Request request, Throwable exception) {

				}
			});
		} catch (RequestException e) {

		}

		return result;
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