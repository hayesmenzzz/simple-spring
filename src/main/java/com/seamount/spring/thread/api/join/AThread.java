package com.seamount.spring.thread.api.join;

class AThread extends Thread {


    AThread(){
        super("[AThread]");
    }

    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "is start!");
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + "is loop at" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName+"is end.");
        }
    }
}
