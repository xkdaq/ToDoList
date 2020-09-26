package com.today.todolist;

import android.app.Application;
import android.content.Context;


public class MyApplication extends Application {

    private static Context mContext;

    public static Context getAppContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        mContext = getApplicationContext();
        super.onCreate();
    }

}
