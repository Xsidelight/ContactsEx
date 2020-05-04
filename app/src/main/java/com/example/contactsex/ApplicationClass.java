package com.example.contactsex;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

import java.util.List;

public class ApplicationClass extends Application
{
    public static final String APPLICATION_ID = "007A619B-350B-85AB-FF23-B3672203D100";
    public static final String API_KEY = "F04EC544-2C9E-E501-FF5F-486AD9CC0100";
    public static final String SERVER_URL = "http://api.backendless.com";

    public static BackendlessUser user;
    public static List<Contact> contacts;

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }
}
