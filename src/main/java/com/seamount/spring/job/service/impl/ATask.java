package com.seamount.spring.job.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.seamount.spring.job.service.IATask;

@Component
public class ATask implements IATask{

	@Scheduled(cron="0/10 * * * * ?")
	@Override
	public void aTask() {
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date())+"*********A任务每10秒执行一次进入测试");
	}

}
