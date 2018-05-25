package com.seamount.spring.callback.my;

import org.junit.Test;

public class MyTest {

	@Test
	public void simulation(){
		Student01 student01 = new Student01();
		Teacher01 thacher01 = new Teacher01(student01);
		thacher01.question();
	}
}
