package com.gfarm.threading;

public class ThreadTester {

	public static void main(String[] args) {
		
		System.out.println("main is starting");
//		Thread thread1 = new Thread1("thread1");
//		thread1.setDaemon(true);
//		thread1.start(); //user thread
		System.out.println("main is exiting");
		
		Thread thread2 = new Thread(new Thread2(), "thread2");
		thread2.start();

	}

}
