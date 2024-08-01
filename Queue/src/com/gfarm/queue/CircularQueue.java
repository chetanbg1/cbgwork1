package com.gfarm.queue;

import java.util.NoSuchElementException;

public class CircularQueue {
	private int capacity = 5;
	private int front = -1;
	private int rear = -1;
	private int[] queue = new int[capacity];

	public boolean isFull() {
		return ((rear + 1) % capacity == front);

	}

	public boolean isEmpty() {
		return (front == -1 && rear == -1);
	}

	public void enqueue(int data) {
		if (isEmpty()) {
			front ++;
			rear ++;
			queue[rear] = data;
		} else if (isFull()) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			rear = (rear + 1) % capacity;
			queue[rear] = data;
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		} else if (front == rear) {
			rear--;
			front--;
		} else {
			System.out.println(queue[front]);
			front = (front + 1) % capacity;
		}
		
	}
	public void print() {
		//int i = front;
		if(isEmpty()) {
			System.out.println("empty queue");
		}else {
			//while(i!= rear)
			for(int i : queue){
				System.out.print(i +" --> ");
				i = (i+1)%capacity;
			}
		}
	}
	
	public static void main(String[] args) {
		CircularQueue que = new CircularQueue();
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		que.enqueue(4);
		que.enqueue(5);
		//que.dequeue();
		 //que.enqueue(7);
		que.print();

	}

}
