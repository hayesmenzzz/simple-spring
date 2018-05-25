package com.seamount.spring.callback;

public class Xiaoming implements Student{

	@Override
	public void resolveQuestion(Callback callback) {
		//模拟思考问题
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//告诉老师答案
		callback.tellAnswer("apple");
	}

}
