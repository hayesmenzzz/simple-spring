package com.seamount.spring.job.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("task1")
public class ScheduledTask {

	private final Logger logger = LoggerFactory.getLogger(ScheduledTask.class);

	@Scheduled(fixedDelay = 5000)//以上一个调用任务的##完成时间##为基准，在上一个任务完成之后，5s后再次执行
	public void demo1() {
		logger.info("定时任务demo1开始......");
		long begin = System.currentTimeMillis();
		// 执行你需要操作的定时任务
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		logger.info("定时任务demo1结束，共耗时：[" + (end - begin) + "]毫秒");
	}

	@Scheduled(fixedRate = 5000)//上一个任务##开始时间##为基准，从上一任务开始执行后5s再次调用
	public void demo2() {
		logger.info("定时任务demo2开始.");
		long begin = System.currentTimeMillis();
		// 执行你需要操作的定时任务
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		logger.info("定时任务demo2结束，共耗时：[" + (end - begin) + "]毫秒");
	}

	@Scheduled(cron="0/5 57 10 * * ?")
	public void demo3() {
		logger.info("定时任务demo3开始.");
		long begin = System.currentTimeMillis();
		// 执行你需要操作的定时任务
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		logger.info("定时任务demo3结束，共耗时：[" + (end - begin) + "]毫秒");
	}

}
