package com.seamount.spring.keyword;

public class ClassA {

	public String show(ClassD obj){
		return "A and D";
	}
	
	public String show(ClassA obj){
		return "A and A";
	}
}
