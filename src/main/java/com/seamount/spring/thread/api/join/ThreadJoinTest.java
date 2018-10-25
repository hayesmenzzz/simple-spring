package com.seamount.spring.thread.api.join;

public class ThreadJoinTest {
    public static void main(String[] args) throws InterruptedException {
        AThread aThread = new AThread();
        BThread bThread = new BThread(aThread);

        aThread.start();
        bThread.start();
        bThread.join();

    }
}
