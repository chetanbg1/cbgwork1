package com.gfarm.stack;

import java.util.EmptyStackException;

public class StackArrya {

	int top;
	int capacity;
	int[] stack;

	public StackArrya() {
		top = -1;
		capacity = 10;
		stack = new int[capacity];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public void push(int data) {
		if(isFull()) {
			throw new StackOverflowError();
		}
		 stack[++top]=data;
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int item =  stack[top--];
		//ltop--;
		return item;
	}
	public int peek() {
		return stack[top];//return stack[top--]
	}
	public void print() {
		for(int n :stack) {
			System.out.print(n + "--> ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		StackArrya sa = new StackArrya();
		sa.push(12);
		sa.push(11);
		sa.push(13);
		sa.push(14);
		
		System.out.println(sa.isEmpty());
		System.out.println(sa.isFull());
		System.out.println(sa.capacity);
		System.out.println(sa.pop());
		System.out.println(sa.peek());
		sa.print();
		sa.pop();
		sa.pop();
		sa.pop();
	
		
		
		
		sa.print();

	}

}
