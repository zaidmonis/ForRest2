package com.example.zaid.forrest.Models;

import android.app.Application;
import android.content.Context;

/**
 * Created by zaid on 15/10/18.
 */

public class ForRest extends Application {
    static Context context;

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        ForRest.context = context;
    }

    @Override
    public void onCreate() {
        context = this;
        super.onCreate();
    }
}
