package com.gfarm.queue;

public class CircularQueueLL {
	private ListNode front = null;
	private ListNode rear = null;
	private int length = 0;
	private class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	//insertion
	public void enqueue(int data) {
		ListNode newNode = new ListNode(data);
		if(rear == null && front ==null) {
			rear = front  = newNode;
			rear.next = front;
		}else {
			rear.next = newNode;
			rear = newNode;
			rear.next = front;
		}
		
	}
	//delete
	public void dequeue() {
		ListNode temp = front;
		if(rear == null && front ==null) {
			return;
		}else if(front ==rear){
			System.out.println(front);
			front =null;
		}else {
			System.out.println(front);
			front = temp.next;
			rear.next = front;
			temp = null;
		}
	}
	
	public void print() {
		ListNode current = front;
		while(current.next != front) {
			System.out.println(current.data + "--> ");
			current = current.next;
		}
		System.out.println(current.data);
		System.out.println();
	}
	public static void main(String[] args) {
		CircularQueue que = new CircularQueue();
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		que.enqueue(4);
		
		que.dequeue();
		que.print();
		

	}

}
