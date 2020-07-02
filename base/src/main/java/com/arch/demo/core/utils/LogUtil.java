package com.arch.demo.core.utils;

import android.util.Log;

public class LogUtil {

    public static boolean isLog = true;
    public static String TAG = "MyOpenGl-------";

    public static void e(String msg) {

        if (isLog) {
            Log.e(TAG, msg);
        }
    }
}
