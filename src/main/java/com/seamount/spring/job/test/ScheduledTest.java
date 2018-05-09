package com.seamount.spring.job.test;

import com.seamount.spring.job.service.impl.ATask;
import com.seamount.spring.job.service.impl.BTask;

public class ScheduledTest {

	public static void main(String[] args) {
		ATask at = new ATask();
		BTask bt = new BTask();
		
		at.aTask();
		bt.bTask();
	}
}
