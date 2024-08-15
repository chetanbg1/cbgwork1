package com.gfarm.threading;

public class DeadLocak {

	public static void main(String[] args) {
		
		System.out.println("main starting");
		String lock1 = "aaa";
		String lock2 = "bbb";

		Thread thread1 = new Thread(() -> {
			synchronized (lock1) {

			}
		});

		Thread t1 = new Thread(() -> {
			synchronized (lock1) {
				try {
					Thread.sleep(1);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("lock acquired");
				}
			}
		}, "thread1");
		Thread t2 = new Thread(() -> {
			synchronized (lock1) {
				try {
					Thread.sleep(1);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("lock acquired");
				}
			}
		}, "thread2");
		
		t1.start();
		t2.start();
	}

}
