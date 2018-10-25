package com.seamount.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.seamount.spring.thread.callable.MyThread;
import com.seamount.spring.thread.callable.MyThread01;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ThreadTest {

	/**
	 * Java多线程实现方式主要有三种：继承Thread类、实现Runnable接口、使用ExecutorService、Callable、
	 * Future实现有返回结果的多线程。 其中前两种方式线程执行完后都没有返回值，只有最后一种是带返回值的。
	 */
	@Test
	public void test() {

		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		myThread1.start();
		myThread2.start();

		System.out.println();

		MyThread01 thread = new MyThread01();
		Thread t = new Thread(thread);
		t.start();
	}

	/**
	 * ExecutorService、Callable、Future这个对象实际上都是属于Executor框架中的功能类
	 * 可返回值的任务必须实现Callable接口，类似的，无返回值的任务必须Runnable接口。
	 * 执行Callable任务后，可以获取一个Future的对象，在该对象上调用get就可以获取到Callable任务返回的Object了，
	 * 再结合线程池接口ExecutorService就可以实现传说中有返回结果的多线程了。
	 * 
	 * 
	 * Executors类，提供了一系列工厂方法用于创先线程池，返回的线程池都实现了ExecutorService接口。 public static
	 * ExecutorService newFixedThreadPool(int nThreads) 创建固定数目线程的线程池。 public
	 * static ExecutorService newCachedThreadPool() 创建一个可缓存的线程池，调用execute
	 * 将重用以前构造的线程（如果线程可用）。如果现有线程没有可用的，则创建一个新线程并添加到池中。终止并从缓存中移除那些已有 60 秒钟未被使用的线程。
	 * public static ExecutorService newSingleThreadExecutor()
	 * 创建一个单线程化的Executor。 public static ScheduledExecutorService
	 * newScheduledThreadPool(int corePoolSize)
	 * 创建一个支持定时及周期性的任务执行的线程池，多数情况下可用来替代Timer类。
	 * 
	 */
	@Test
	public void test01() {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Runnable task1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("task1 start!");
			}
		};
		Runnable task2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("task2 start!");
			}
		};
		executor.execute(task1);
		executor.execute(task2);
		
		executor = Executors.newScheduledThreadPool(10);
		ScheduledExecutorService scheduler = (ScheduledExecutorService) executor;
		scheduler.scheduleAtFixedRate(task1, 10, 10, TimeUnit.SECONDS);

	}

}
