package com.seamount.spring.thread.simpledataformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalTest {

    public static String safeDateFormate(Date date){
        SimpleDateFormat formate = PerThreadFormate.getFormate();
        return formate.format(date);
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());
        t1.start();
        t2.start();

    }
}
