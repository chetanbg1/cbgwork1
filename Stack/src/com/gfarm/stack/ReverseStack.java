package com.gfarm.stack;

import java.util.Stack;

public class ReverseStack {
	
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverse(s);
		pushAtBottom(top,s);
	}
	private static void pushAtBottom(int data, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottom(data, s);
		s.push(top);
		
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
	
		
		reverse(s);
		
		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
			
		}

	}

}
