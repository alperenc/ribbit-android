package com.alperencan.ribbitapp;

import android.app.Application;

import com.alperencan.ribbitapp.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;

/**
 * Created by pvdispvd on 08/10/14.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "4Gwai3qlCtfMt9SyGScbedY2ZRa7FHB3N8PsQarD", "Y2pM659FvculXyQKf6RirINuUQf8S0jjGL91X1am");

        ParseInstallation.getCurrentInstallation().saveInBackground();
    }

    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());

        installation.saveInBackground();
    }
}
