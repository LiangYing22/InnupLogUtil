package com.innup.logutil;

import android.text.TextUtils;
import android.util.Log;

/**
 * "v", "d", "i", "w", "e"
 */
public class LogUtil {
    private static final String TAG = "LogUtil";

    public static void v(String tag, String msg){
        Log.v(tag, LogHelper.getInstance().getClassNameAndLine() + " " + msg);
    }

    public static void d(String tag, String msg){
        Log.d(tag, LogHelper.getInstance().getClassNameAndLine() + " " + msg);
    }

    public static void i(String tag, String msg){
        Log.i(tag, LogHelper.getInstance().getClassNameAndLine() + " " + msg);
    }

    public static void w(String tag, String msg){
        Log.w(tag, LogHelper.getInstance().getClassNameAndLine() + " " + msg);
    }

    public static void e(String tag, String msg, Throwable e){
        msg = msg + Log.getStackTraceString(e);
        Log.e(tag, LogHelper.getInstance().getClassNameAndLine() + " " + msg);
    }
}
