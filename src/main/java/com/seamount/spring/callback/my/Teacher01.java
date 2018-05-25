package com.seamount.spring.callback.my;

public class Teacher01 {

	private Student01 student01;
	
	
	public Teacher01(Student01 student01) {
		super();
		this.student01 = student01;
	}

	public void question(){
		System.out.println("1+1=?");
		student01.solve(this);
	}
	
	public void callback(int answer){
		System.out.println("我知道了，你的答案是：" + answer);
	}
}
