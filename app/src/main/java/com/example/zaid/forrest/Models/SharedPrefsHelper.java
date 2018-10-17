package com.example.zaid.forrest.Models;

import android.content.Context;

import com.google.gson.Gson;

/**
 * Created by zaid on 15/10/18.
 */

public class SharedPrefsHelper {
    static final String fileName = "creds.txt";
    static final String loginData = "Login";
    public static void saveLoginData(UserClass user){
        Gson gson = new Gson();
        String userData = gson.toJson(user);
        ForRest.getContext().getSharedPreferences(fileName, Context.MODE_PRIVATE).edit().putString(loginData, userData).commit();
    }
    public static UserClass getLoginData(){
        String  userData = ForRest.getContext().getSharedPreferences(fileName, Context.MODE_PRIVATE).getString(loginData, "");
        if (userData.equals("")) {
            return null;
        }
        else{
            Gson gson = new Gson();
            UserClass user = gson.fromJson(userData, UserClass.class);
            return user;
        }
    }
}
