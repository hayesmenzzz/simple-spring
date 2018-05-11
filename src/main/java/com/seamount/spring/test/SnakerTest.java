package com.seamount.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seamount.spring.dao.PlatformJkLoanApplyBean;
import com.seamount.spring.service.PlatformJkLoanApplyService;

public class SnakerTest {
	
	@Autowired
	private PlatformJkLoanApplyService platformJkLoanApplyService;

	@Before
	public void init(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(context.toString());
	}
	
	@Test
	public void test(){
		PlatformJkLoanApplyBean platformJkLoanApplyBean = platformJkLoanApplyService.queryForApplyNo("CD-180319-0003-C01");
		System.out.println(platformJkLoanApplyBean.toString());
	}
}
