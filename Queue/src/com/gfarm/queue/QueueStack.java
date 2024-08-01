package com.gfarm.queue;

import java.util.EmptyStackException;

public class QueueStack {
	int capacity = 5;
	int[] stack1 = new int[capacity];
	int[] stack2 = new int[capacity];
	int top1 = -1;
	int top2 = -1;
	int count = 0;
	
	
	private void push1(int data) {
		if (top1 == capacity - 1) {
			throw new StackOverflowError();
		} else 
			stack1[++top1] = data;
	}
	
	private void push2(int data) {
		if (top2 == capacity - 1) {
			throw new StackOverflowError();
		} else 
			stack2[++top2] = data;
		
	}
	
	private int pop1() {
		if(top1 == -1) {
			throw new EmptyStackException();
		}
		return stack1[top1--];
	}
	private int pop2() {
		if(top2 == -1) {
			throw new EmptyStackException();
		}
		return  stack2[top2--];
	}

	// print
	public void print() {
		for(int i : stack1) {
			System.out.print(i + " --> ");
		}
	}

	// insertion
	public void enqueue(int data) {
		push1(data);
		count++;
	}
	//deletion
	public void dequeue() {
		if(top1 == -1) {
			throw new EmptyStackException();
		}else {
			for(int i =0; i<count; i++ ) {
				int a =pop1();
				push2(a);
			}
			int b= pop2();
			count --;
			for(int i=0; i< count; i++) {
				int a= pop2();
				push1(a);
			}
		}
	}

	

	
	

	public static void main(String[] args) {
		QueueStack que = new QueueStack();
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		que.enqueue(4);
		que.enqueue(5);
		que.dequeue();
		que.print();

	}

}
