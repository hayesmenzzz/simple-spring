package com.seamount.spring.dao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seamount.spring.dao.model.CityModel;
import com.seamount.spring.dao.service.CityService;

public class MybatisTest {

	@Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");  
		CityService cityService = (CityService) context.getBean("cityServiceImpl");
		CityModel cityModel = new CityModel();
		cityModel.setFirst_letter("test");
		cityModel.setId(1);
		cityModel.setName("test");
		cityModel.setPid(1);
		cityModel.setPinyin("test");
		cityService.insert(cityModel);
		
	}
}
