package com.gfarm.queue;

public class QueueArray {
	private int front;
	private int rear;
	private int[] queue;
	private int capacity;
	private int length;

	public QueueArray(int capacity) {
		front = -1;
		rear = -1;
		this.capacity = capacity;
		length = 0;
		queue = new int[capacity];
	}

	public boolean isEmpty() {
		return rear == -1;
	}

	public boolean isFull() {
		return rear == capacity - 1;
	}

	public void print() {
		for (int i : queue) {
			System.out.print(i + " --> ");
		}
	}

	public void enqueue(int data) {
		if (isFull()) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			queue[++rear] = data;
		}

	}

	// remove
	public int dequeue() {
		if (isEmpty()) {
			return -1;
		} else if (front == rear) {
			front = rear = -1;
		} else {
			front++;
		}
		return queue[front];
	}

	// remove 2 // O(n)
	public int dequeue1() {
		if (isEmpty()) {
			return -1;
		}
		front = queue[0];
		for (int i = 0; i < rear; i++) {
			queue[i] = queue[i + 1];
		}
		rear--;

		return front;
	}

	// peek
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return queue[0];

	}

	public static void main(String[] args) {
		QueueArray que = new QueueArray(5);
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);

		while (!que.isEmpty()) {
			System.out.println(que.peek());
			que.dequeue1();
		}
		// que.print();
		// System.out.println(que.dequeue1());
//		System.out.println(que.peek());
//		que.print();

	}

}
