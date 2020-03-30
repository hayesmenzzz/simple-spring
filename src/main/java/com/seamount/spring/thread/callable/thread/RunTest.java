package com.seamount.spring.thread.callable.thread;

import com.seamount.spring.thread.callable.MyThread;
import com.seamount.spring.thread.callable.MyThread1;

public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        /** 多个对象 各自线程维护自己的变量 这里不考虑并发 **/
//        MyThread a = new MyThread("A");
//        MyThread b = new MyThread("B");
//        MyThread c = new MyThread("C");
//        a.start();
//        b.start();
//        c.start();


        /** 一个对象 多个新建多个线程一起跑 多个线程共享一个变量 此时产生非线程安全问题 **/
//        MyThread1 myThread1 = new MyThread1();
//        Thread a = new Thread(myThread1, "A");
//        Thread b = new Thread(myThread1, "B");
//        Thread c = new Thread(myThread1, "C");
//        Thread d = new Thread(myThread1, "D");
//        Thread e = new Thread(myThread1, "E");
//        a.start();
//        b.start();
//        c.start();
//        d.start();
//        e.start();

        MyThread1 a = new MyThread1();
//        Thread a = new Thread(myThread1, "A");
        a.start();
        Thread.sleep(2000);
//        a.stop();
        a.interrupt();
        System.out.println("是否停止1？="+a.isInterrupted());

    }

}
