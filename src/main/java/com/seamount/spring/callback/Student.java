package com.seamount.spring.callback;

/**
 * 将学生进行抽象 将学生进行抽象之后，对于老师这边来说就非常灵活，因为老师未必对一个学生进行提问，可能同时对Ricky、Jack、Lucy三个学生进行提问，
 * 这样就可以将成员变量Student改为List<Student>，这样在提问的时候遍历Student列表进行提问，然后得到每个学生的回答即可
 * 
 * @author Administrator
 *
 */
public interface Student {

	public void resolveQuestion(Callback callback);
}
