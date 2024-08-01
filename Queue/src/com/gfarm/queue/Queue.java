package com.gfarm.queue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Queue {

	private ListNode front;
	private ListNode rear;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public Queue() {
		front = null;
		rear = null;
		length =0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	// print
	public void print() {
		if(isEmpty()) {
			return;  
		}
		ListNode temp = front;
		while(temp != null) {
			System.out.print(temp.data+ "--> ");
			temp = temp.next;
		}
		//System.out.println(rear.data);
		System.out.println();
	} 
	// insertion

	public void enqueue(int data) {
		ListNode newNode = new ListNode(data);
		if (isEmpty()) {
			front= rear = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;
		length++;
	}

	// deletion
	public int dequeue() {
		
		if (isEmpty()) {
			throw new NoSuchElementException();
		
		} 
			int result = front.data;
		    front = front.next;
			
		if(front ==rear) {
			rear =null;
		}
		length --;
		return result;
	}
	
	public int first() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return front.data;
	}
	public int last() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return rear.data;
	}
	public static void main(String[] args) {
		Queue que = new Queue();
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		que.enqueue(4);
		que.enqueue(5);
		que.print();
		que.dequeue();
		que.print();
		System.out.println(que.last());

	}

}
