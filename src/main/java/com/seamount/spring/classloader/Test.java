package com.seamount.spring.classloader;

import org.springframework.context.ApplicationContext;

public class Test {

	private static void loadClass() throws ClassNotFoundException {
		Class<?> clazz = Class.forName("com.seamount.spring.classloader.MusicPlayer");
		ClassLoader classLoader = clazz.getClassLoader();
		System.out.printf("ClassLoader is %s", classLoader.getClass().getSimpleName());
	}

	private static void printParent() throws ClassNotFoundException {
		Class<?> clazz = Class.forName("com.seamount.spring.classloader.MusicPlayer");
		ClassLoader classLoader = clazz.getClassLoader();
		System.out.printf("currentClassLoader is %s\n", classLoader.getClass().getSimpleName());
		while (classLoader.getParent() != null) {
			classLoader = classLoader.getParent();
			System.out.printf("Parent is %s\n", classLoader.getClass().getSimpleName());
		}
	}

	private static void loadClass01() throws ClassNotFoundException {
		ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
		Class<?> clazz = appClassLoader.loadClass("com.seamount.spring.classloader.MusicPlayer");
		ClassLoader classLoader = clazz.getClassLoader();
		System.out.printf("ClassLoader is %s", classLoader.getClass().getSimpleName());
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// loadClass();
//		printParent();
		loadClass01();
	}
}
