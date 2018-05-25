package com.seamount.spring.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 
 * @author Administrator
 * 
 * 
 *         FutureTask实现了两个接口,Runnable和Future,所以它既可以作为Runnable被线程执行，
 *         又可以作为Future得到Callable的返回值 多用于的场景：
 *         假设有一个很耗时的返回值需要计算,并且这个返回值不是立刻需要的话,那么就可以使用这个组合,用另一个线程去计算返回值,
 *         而当前线程在使用这个返回值之前可以做其它的操作,等到需要这个返回值时，再通过Future得到，岂不美哉！
 * 
 *
 */
public class CallableAndFuture {

	public static void main(String[] args) {
		Callable<Integer> callable = new Callable<Integer>() {
			public Integer call() {
				return new Random().nextInt(100);
			}
		};

		FutureTask<Integer> future = new FutureTask<Integer>(callable);
		new Thread(future).start();

		try {
			Thread.sleep(5000);
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
