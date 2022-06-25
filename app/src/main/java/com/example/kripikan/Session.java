package com.example.kripikan;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.kripikan.model.Login.UserLogin;


import java.util.HashMap;

public class Session {
    private Context contexts;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public static final String IS_LOGGED_IN ="isloggedin";
    public static final String IDUSER = "iduser";
    public static final String USERNAME = "username";
    public static final String EMAIL = "email";
    public static final String ADDRESS = "address";
    public static final String PHONE = "phone";


    public Session (Context context){
        this.contexts = context;
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sharedPreferences.edit();
    }

    public void createLoginSession(UserLogin user){
        editor.putBoolean(IS_LOGGED_IN,true);
        editor.putInt(IDUSER, user.getIduser());
        editor.putString(USERNAME, user.getUsername());
        editor.putString(EMAIL, user.getEmail());
        editor.putString(ADDRESS, user.getAddress());
        editor.putString(PHONE, user.getPhone());
        editor.commit();

    }


    public HashMap<String, String>getUserDetail(){
        HashMap<String, String>user = new HashMap<>();
        user.put(IDUSER, sharedPreferences.getString(IDUSER, null));
        user.put(USERNAME, sharedPreferences.getString(USERNAME, null));
        user.put(EMAIL, sharedPreferences.getString(EMAIL, null));
        user.put(ADDRESS, sharedPreferences.getString(ADDRESS, null));
        user.put(PHONE, sharedPreferences.getString(PHONE, null));
        return user;
    }

    public void logOutSession(){
        editor.clear();
        editor.commit();
    }

    public  boolean IsLoggedIn(){
        return sharedPreferences.getBoolean(IS_LOGGED_IN, false);
    }
}
