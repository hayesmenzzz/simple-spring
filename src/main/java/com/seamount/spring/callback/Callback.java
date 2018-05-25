package com.seamount.spring.callback;

/**
 * 将老师进行抽象
 * 将老师进行抽象之后，对于学生来说，就不需要关心到底是哪位老师询问我问题，只要我根据询问的问题，得出答案，然后告诉提问的老师就可以了，即使老师换了一茬又一茬，对我学生而言都是没有任何影响的
 * @author Administrator
 *
 */
public interface Callback {

	public void tellAnswer(String fruit);
}
