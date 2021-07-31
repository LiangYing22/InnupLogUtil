package com.innup.innuplogutil;

import com.innup.logutil.LogUtil;

public class Test {
    private static final String TAG = "Test";
    public static void test(){
        LogUtil.d(TAG, "test of d");
        LogUtil.w(TAG, "test of w");
        LogUtil.i(TAG, "test of i");
        LogUtil.v(TAG, "test of v");
    }
}
