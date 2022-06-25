package com.example.kripikan;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.HashMap;

public class SessionProduct {

    private Context contextp;
    private SharedPreferences sharedPreferencesp;
    private SharedPreferences.Editor editorp;

    public static final String IDPRODUCT = "idproduct";
    public static final String NAME = "name";
    public static final String PRICE = "price";
    public static final String DESCRIPTION = "description";
    public static final String IMG = "img";

    public SessionProduct (Context contextsp){
        this.contextp = contextsp;
        sharedPreferencesp = PreferenceManager.getDefaultSharedPreferences(contextsp);
        editorp = sharedPreferencesp.edit();
    }

    public HashMap<String, String> getProductDetail(){
        HashMap<String, String>user = new HashMap<>();
        user.put(IDPRODUCT, sharedPreferencesp.getString(IDPRODUCT, null));
        user.put(NAME, sharedPreferencesp.getString(NAME, null));
        user.put(PRICE, sharedPreferencesp.getString(PRICE, null));
        user.put(DESCRIPTION, sharedPreferencesp.getString(DESCRIPTION, null));
        user.put(PRICE, sharedPreferencesp.getString(PRICE, null));
        return user;
    }
}
