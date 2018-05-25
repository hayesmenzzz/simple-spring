package com.seamount.spring.callback.my;

public class Student01 {

	
	public void solve(Teacher01 teacher01){
		System.out.println("容学生思考一下");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		teacher01.callback(2);
	}
}
