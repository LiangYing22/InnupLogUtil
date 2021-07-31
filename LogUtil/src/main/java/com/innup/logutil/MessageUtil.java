package com.innup.logutil;


import android.text.TextUtils;

import java.util.logging.LogManager;

public class MessageUtil {
    public static String getSimpleClassName(String name) {
        int lastIndex = name.lastIndexOf(".");
        return name.substring(lastIndex + 1);
    }
}
