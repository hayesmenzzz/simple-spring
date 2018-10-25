package com.seamount.spring.thread.simpledataformat;


        import java.text.SimpleDateFormat;

public class PerThreadFormate extends Thread {

    private static final ThreadLocal<SimpleDateFormat> localFormate = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            System.out.println("Current Thread :"+ Thread.currentThread().getName());
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };


    public static SimpleDateFormat getFormate(){
        return localFormate.get();
    }
}
