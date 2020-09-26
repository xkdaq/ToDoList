package com.today.todolist.util;

import android.util.Log;

import com.today.todolist.BuildConfig;

public class XLog {

    public static void e(String message) {
        if (BuildConfig.DEBUG) {
            Log.e("-->", message);
        }
    }
}
