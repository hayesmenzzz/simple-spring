package com.seamount.job;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class ScheduledTest {
	
	@Before
	public void before(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
	}
	
	
	@Test
	public void test1() throws InterruptedException{
		System.out.println("开始执行定时任务。。。");
		Thread.sleep(100000);
		System.out.println("结束执行定时任务。。。");
	}
}
