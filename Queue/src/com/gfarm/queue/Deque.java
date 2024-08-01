package com.gfarm.queue;

public class Deque {
	private int capacity =5;
	private int front = -1;
	private int rear =-1;
	private int[] deque = new int[capacity];
	
	
	//insertion from front
	public void enqueueFront(int data) {
		//if((front ==0 && rear ==N-1)||(front== rear-1))
		if((rear+1)%capacity ==front){
			System.out.println("queue is full ");
		}else if(front ==-1 && rear ==-1) {
			front =rear = 0;
			deque[front]=data;
		}else if(front==0) {
			front = capacity -1;
			deque[front]=data;
		}else {
			front--;
			deque[front] = data;
		}
	}
	//insertion from rear
	public void enqueRear(int data) {
		if((rear+1)%capacity ==front){
			System.out.println("queue is full ");
		}else if(rear ==-1 && front ==-1) {
			front =rear = 0;
			deque[rear]=data;
		}else if(rear==capacity-1) {
			rear = 0;
			deque[rear]=data;
		}else {
			rear++;
			deque[rear] = data;
		}
	}
	//delete from front
	public void dequeueFront() {
		if(front==-1&& rear ==-1) {
			System.out.println("queue is empty");
		}else if(front == rear) {
			System.out.println(deque[front]);
			front = rear =-1;
		}else if(front ==capacity-1) {
			
			System.out.println(deque[front]);
			front =0;
		}else {
			System.out.println(deque[front]);
			front ++;
		}
	}
	//delete from rear
	public void dequeueRear() {
		if(front==-1&& rear ==-1) {
			System.out.println("queue is empty");
		}else if(front == rear) {
			System.out.println(deque[rear]);
			front = rear =-1;
		}else if(rear ==0) {
			
			System.out.println(deque[rear]);
			rear =capacity-1;
		}else {
			System.out.println(deque[rear]);
			rear --;
		}
	}
	public void print() {
		//int i = front;
		if(front==-1&& rear ==-1) {
			System.out.println("empty queue");
		}else {
			//while(i!= rear)
			for(int i : deque){
				System.out.print(i +" --> ");
				i = (i+1)%capacity;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Deque que = new Deque();
		que.enqueueFront(1);
		que.enqueueFront(2);
		que.enqueueFront(3);
		que.print();
		que.enqueRear(4);
		que.print();
		que.dequeueFront();
		que.dequeueRear();

	}

}
