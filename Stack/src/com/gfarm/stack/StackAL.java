package com.gfarm.stack;

import java.util.ArrayList;

public class StackAL {

	
		static ArrayList<Integer> list = new ArrayList<>();

		public  boolean isEmpty() {
			return list.size() == 0;
		}

		// push
		public  void push(int data) {
			
				list.add(data);
			
		}

		// pop
		public int pop() {
			if (isEmpty()) {
				return -1;
			}
			//int top = list.get(list.size() - 1);
			int top = list.remove(list.size() - 1);
			return top;
		}

		// peek
		public  int peek() {
			if (isEmpty()) {
				return -1;
			}
			return list.get(list.size() - 1);
		}
		//print
		public void print() {
			while(!isEmpty()) {
				System.out.println(peek());
				pop();
			}
		}

	public static void main(String[] args) {
		StackAL s = new StackAL();
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		
//		while(!s.isEmpty()) {
//			System.out.println(s.peek());
//			s.pop();
//		}
		s.print();

	}

}
