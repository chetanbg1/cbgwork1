package com.gfarm.stack;

public class TwoStacks {

	int size;
	int top1, top2;
	int array[];

	public TwoStacks(int size) {
		super();
		this.size = size;
		this.top1 = -1;
		this.top2 = size;
		this.array = new int[size];
	}

	public void push1(int data) {
		if (top1 < top2) {
			array[++top1] = data;
			System.out.println("element pushed in stack 1 : " + data);
		}else {
			System.out.println("stack overflow");
			System.exit(1);
		}
	}
	
	public void push2(int data) {
		if (top1 < top2-1) {
			array[--top2] = data;
			System.out.println("element pushed in stack 2 : " + data);
		}else {
			System.out.println("stack overflow");
			System.exit(1);
		}
	}

	public int pop1() {
		
		if(top1>=0) {
			int result = array[top1--];
			System.out.println("element poped in stack 1 : " + result);
			return result;
		}else {
			System.out.println("stack underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public int pop2() {
		
		if(top2<size) {
			int result = array[top2--];
			System.out.println("element poped in stack 2 : " + result);
			return result;
		}else {
			System.out.println("stack underflow");
			System.exit(1);
		}
		return 0;
		
	}
	public static void main(String[] args) {
		TwoStacks s = new TwoStacks(10);
		s.push1(1);
		s.push1(2);
		s.push1(3);
		s.push1(4);
		s.pop1();
		s.push2(5);
		s.push2(6);
		s.push2(7);
		

	}

}
