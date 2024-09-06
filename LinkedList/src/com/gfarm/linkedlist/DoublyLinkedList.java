package com.gfarm.linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			super();
			this.data = data;
			this.next = next;
			this.previous = previous;
		}

	}

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return length == 0; // length == 0; head ==null
	}

	public int length() {
		return length;
	}

	// print list

	public void print() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "--> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void print(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "--> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	// print inreverse ordder
	public void printReverse() {
		ListNode current = tail;
		while (current != null) {
			System.out.print(current.data + "--> ");
			current = current.previous;
		}
		System.out.print("null");
		System.out.println();
	}

	// insert first
	private void insertFirst(int data) {
		ListNode newNode = new ListNode(data);
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}

	// insert last
	public void insertLast(int data) {
		ListNode newNode = new ListNode(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		length++;
	}

	// delete first
	public ListNode removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = head;
		if (head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;

	}
	// remove first
	public ListNode removeHead() {
		if (head == null) {
			return null;
		} else {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			head.previous=null;
			return temp;
		}
	}

	// delete last
	public ListNode removeLast() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = tail;
		if (head == tail) {
			head = null;
		} else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		length--;
		return temp;
	}
	
	// insert at any position

		public void insertAtAnyPosition(int data, int position) {
			ListNode newNode = new ListNode(data);
			if (position == 1) {
				head.previous = newNode;
				newNode.next = head;
				head= newNode;
			} else {
				ListNode temp = head;
				int count = 1;
				while (count < position - 1) {
					temp = temp.next;
					count++;
				}
				ListNode current = temp.next;
				newNode.next = current;
				current.previous = newNode;
				newNode.previous = temp;
				temp.next = newNode;
			}
		}
		
	// remove from given posion
		public void removeAtPosition(int position) {
			if(isEmpty()) {
				throw new NoSuchElementException();
			}
			if(position==1) {
				removeFirst();
			}else {
				ListNode temp = head;
				int count =1;
				while(count < position-1) {
					temp = temp.next;
					count++;
				}
				ListNode current = temp.next;
				temp.next = current.next;
				current.next.previous = temp;
			}
		}
		// search element in linked list
		public ListNode search(int data) {
			ListNode current = head;
			while (current != null) {
				if (current.data == data) {
					return current;
				}
				current = current.next;
			}
			return null;
		}
		
		// remove duplicated from sorted list
		public void removeDuplicates() {
			ListNode current = head;
			while (current != null && current.next != null) {
				if (current.data == current.next.data) {
					current.next = current.next.next;
					current.next.next.previous=current;
				}
				current = current.next;
			}
		}
		
		// reverse linklist
		public ListNode reverse() {
			if (head == null) { //null check
				return null;
			}
			ListNode current = head; //create current node assign head to it
			while (current != null) {  // traverse
				ListNode nextNode = current.next; // next node current ka next
				current.next = current.previous; // current next = current previous
				current.previous = nextNode;   // current previous = is current 
				current = nextNode; 
			}
			current = head;
			head =tail;
			tail =current;
			return head;
		}


	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertFirst(1);
		dll.insertLast(2);
		dll.insertLast(2);
		dll.insertLast(3);
		dll.insertLast(4);
		//dll.print();
		// System.out.println((dll.removeFirst().data));
		//System.out.println((dll.removeLast().data));
		//dll.insertAtAnyPosition(7, 3);
		dll.print();
		//dll.removeHead();
		//dll.removeAtPosition(3);
		//System.out.println(dll.search(2).data);
		//dll.removeDuplicates();
		dll.reverse();
		dll.print();

	}

}
