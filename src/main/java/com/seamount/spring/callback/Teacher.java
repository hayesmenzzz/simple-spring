package com.seamount.spring.callback;

public class Teacher implements Callback{

	private Student student;
	
	
	
	public Teacher(Student student) {
		super();
		this.student = student;
	}


	public void askQuestion(){
		System.out.println("你爱吃什么水果？");
		
		
		//********************回调的核心就是回调方将本身即this传递给调用方*******************
		//这样调用方就可以在调用完毕之后告诉回调方它想要知道的信息
		student.resolveQuestion(this);
	}

	@Override
	public void tellAnswer(String fruit) {
		System.out.println("知道了你的答案是："+ fruit);
		System.out.println("我们继续上课。");
	}

	
	
	

}
