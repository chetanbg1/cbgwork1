package com.gfarm.threading;

public class Thread1 extends Thread {
	
	public Thread1(String threadName) {
		super(threadName);
	}
	public void run() {
		for(int i=0; i<5;i++) {
			//System.out.println("inside thread1 " + i);
			System.out.println("inside "+ Thread.currentThread().getName()+" " + i);
		}
	}
}
