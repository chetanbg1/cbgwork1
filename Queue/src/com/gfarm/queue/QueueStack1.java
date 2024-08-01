package com.gfarm.queue;

import java.util.Stack;

public class QueueStack1 {

	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();

	public boolean isEmpty() {
		return s1.isEmpty() && s2.isEmpty();

	}

	public void add(int data) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(data);
		while (!s2.isEmpty()) {
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
