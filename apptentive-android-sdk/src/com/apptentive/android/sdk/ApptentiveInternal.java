/*
 * Copyright (c) 2014, Apptentive, Inc. All Rights Reserved.
 * Please refer to the LICENSE file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.apptentive.android.sdk;

import android.app.Activity;
import com.apptentive.android.sdk.model.Event;
import com.apptentive.android.sdk.module.engagement.EngagementModule;

import java.util.HashMap;
import java.util.Map;

/**
 * This class contains only internal methods. These methods should not be access directly by the host app.
 *
 * @author Sky Kelsey
 */
public class ApptentiveInternal {

	private static Map<String, String> ratingProviderArgs;

	public static void onAppLaunch(final Activity activity) {
		EngagementModule.engageInternal(activity, Event.EventLabel.app__launch.getLabelName());
	}

	public static Map<String, String> getRatingProviderArgs() {
		return ratingProviderArgs;
	}

	public static void putRatingProviderArg(String key, String value) {
		if (ratingProviderArgs == null) {
			ratingProviderArgs = new HashMap<String, String>();
		}
		ratingProviderArgs.put(key, value);
	}

}