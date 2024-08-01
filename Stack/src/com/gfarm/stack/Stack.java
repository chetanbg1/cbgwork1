package com.gfarm.stack;

import java.util.EmptyStackException;

public class Stack {
	private ListNode top;//head
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data =data;
		}
	}
	
	public Stack() {
		top=null;
		length=0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length ==0;
	}
	//print
	public void print() {
		ListNode temp = top;
		while(!isEmpty()) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
			pop();
		}System.out.println();
	}
	
	//insertion
	public void push(int data) {
		ListNode newNode =  new ListNode(data);
		if(isEmpty()) {
			top =newNode;
		}
		newNode.next = top;
		top=newNode;
		length++;
	}
	//deletion
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top= top.next;
		length--;
		return result;
	}
	//peek
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.push(10);
		st.push(11);
		st.push(21);
		st.print();
		//System.out.println(st.peek());
		//print
		
			while(!st.isEmpty()) {
				System.out.println(st.peek());
				st.pop();
			}
		
	//	st.pop();
		//st.print();
	}

}
