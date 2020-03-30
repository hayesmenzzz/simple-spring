package com.seamount.spring.thread.callable;

public class MyThread1 extends Thread {

//    private int count = 10;

    @Override
    public void run() {
        super.run();
        for (int i = 0; i <100 ; i++) {
            
            if(this.isInterrupted()){
                System.out.println("线程被标记退出 我要退出了");
                return;
            }

            System.out.println("i=" + (i + 1));


            /** jvm中 i--分三步 首先取得原有i的值 其次计算i-1 最后对i进行赋值
             * 这三个步骤中 如果有多个线程同时访问 那么一定会出现非线程安全问题 **/
//            count--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
        }
        System.out.println("END...");
    }

}
