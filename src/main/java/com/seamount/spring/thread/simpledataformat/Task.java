package com.seamount.spring.thread.simpledataformat;

import java.util.Date;

public class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Current Thread Name"+ Thread.currentThread().getName()+"" +
                    ",dataFromate:"+ThreadLocalTest.safeDateFormate(new Date()));
        }
    }
}
