package com.seamount.spring.thread.api.join;

public class BThread extends Thread {

    AThread aThread;

    BThread(AThread aThread){
        super("[BThread]");
        this.aThread = aThread;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "is start!");
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + "is loop at" + i);
            try {
                aThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + "is End.");
    }
}
