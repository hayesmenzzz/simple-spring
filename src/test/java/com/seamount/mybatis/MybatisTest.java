package com.seamount.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.seamount.spring.dao.model.CityModel;
import com.seamount.spring.dao.service.CityService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MybatisTest {
	
	@Autowired
	private CityService cityService;
	
	@Test
	public void cityTest(){
		CityModel cityModel = new CityModel();
		cityModel.setId(3);
		cityModel.setName("test");
		cityModel.setPid(1);
		cityModel.setPinyin("test");
		cityModel.setFirst_letter("test");
		cityService.insert(cityModel);
	}

}
