package com.seamount.spring.job.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.seamount.spring.job.service.IBTask;

@Component
public class BTask implements IBTask{

	@Scheduled(cron="0/5 * * * * ?")
	@Override
	public void bTask() {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date())+"*********B任务每5秒执行一次进入测试");
	}

}
