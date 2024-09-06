package com.gfarm.queue;

import java.util.Stack;

public class QueueStack1 {

	static Stack<Integer> s1 = new Stack<>();  //create a stack s1 and s2
	static Stack<Integer> s2 = new Stack<>();  

	public boolean isEmpty() {
		return s1.isEmpty() && s2.isEmpty(); //check if empty

	}

	public void add(int data) {  
		while (!s1.isEmpty()) { //empty the s1
			s2.push(s1.pop()); //push in s2
		}
		s1.push(data);  // add new data
		while (!s2.isEmpty()) {  //again put all data back in s1 from s2
			s1.push(s2.pop());
		}
	}

	public int remove() {
		if (isEmpty()) {
			System.out.println("empty queue");
			return -1;
		}
		return s1.pop();
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("empty queue");
			return -1;
		}
		return s1.peek();
	}

	public static void main(String[] args) {
		QueueStack1 q = new QueueStack1();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
