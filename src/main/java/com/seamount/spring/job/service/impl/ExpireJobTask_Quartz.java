package com.seamount.spring.job.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpireJobTask_Quartz {

	private static final Logger logger = LoggerFactory.getLogger(ExpireJobTask_Quartz.class);
	
	public void doBusiness(){
		//每天凌晨生成前天报表，每一小时生成汇总数据等等 业务逻辑
		//该业务逻辑和一斑普通类没有任何区别，它定义的doBusiness就是调度业务方法
		System.out.println("开始处理业务逻辑。。。");
	}
}
