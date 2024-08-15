package com.gfarm.threading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
	
	private Queue<Integer> q;
	private int capaciry;
	
	public BlockingQueue(int cap) {
		this.q = new LinkedList<>();
		this.capaciry = cap;
	}
	
	public boolean add(int item) {
		synchronized (q) {
			//while over if loop if there are more than 1 threads are in waiting state
			while(q.size() == capaciry) {
				try {
					q.wait(); //waiting for remove() to notify
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//return false;
			}
			q.add(item);
			 // notify all(particularly remove method) that item has been added 
			//so they can start the exexution
			q.notifyAll(); // notify all(particularly remove method) that item has been added 
			return true;
		}
	}
	public int remove() {
		synchronized (q) {
			while(q.size() ==0) {//if no items in queue remove operation has to wait
				try {
					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//return -1;
			}
			int item = q.poll();
			//notifies to add method that it has some space to add item 
			q.notifyAll();
			return item;
		}
	}
}
