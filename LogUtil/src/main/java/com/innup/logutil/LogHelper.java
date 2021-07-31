package com.innup.logutil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LogHelper {

    private final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());

    private LogHelper(){

    }

    private static class LogHelperInner{
        private static final LogHelper logHelper = new LogHelper();
    }

    public static LogHelper getInstance(){
        return LogHelperInner.logHelper;
    }

    /**
     * 获取当前时间
     */
    public String getCurrentTime(){
        return sf.format(new Date());
    }

    /**
     * 获取进程ID
     * @return 进程id
     */
    public int getPid(){
        return android.os.Process.myPid();
    }

    /**
     * 获取线程ID
     * @return 线程id
     */
    public int getTid(){
        return android.os.Process.myTid();
    }

    /**
     * 获取当前类名加行数
     * [类名|方法名(行数)]
     */
    public String getClassNameAndLine(){
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        StackTraceElement element = trace[4];
        return "[" + MessageUtil.getSimpleClassName(element.getClassName()) + "|" + element.getMethodName() + "(" + element.getLineNumber() + ")" + "]";
    }

}
