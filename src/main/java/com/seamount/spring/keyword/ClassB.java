package com.seamount.spring.keyword;

public class ClassB extends ClassA{

	public String show(ClassB obj){
		return "B and B";
	}
	
	public String show(ClassA a){
		return "B and A";
	}
}
