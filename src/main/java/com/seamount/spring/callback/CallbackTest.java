package com.seamount.spring.callback;

import org.junit.Test;

/**
 * 回调测试
 * @author Administrator
 * 
 * 回调的核心就是回调方将本身即this传递给调用方
 *
 */
public class CallbackTest {

	@Test
	public void testCallback(){
		Student student = new Xiaoming();
		Teacher teacher = new Teacher(student);
		//老师调用学生接口方法resolveQuestion 向学生提问
		//学生解决问题的方法里面在完成之后 调用老师的回调方法 tellAnswer 
		//这样一套流程 构成一种双向调用关系
		teacher.askQuestion();
	}
}
