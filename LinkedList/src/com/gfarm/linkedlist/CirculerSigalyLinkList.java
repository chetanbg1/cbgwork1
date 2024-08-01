package com.gfarm.linkedlist;

public class CirculerSigalyLinkList {

	private ListNode last;
	private int length;

	private class ListNode {
		private ListNode next;
		private int data;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public CirculerSigalyLinkList() {

	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void createCLL() {
		ListNode first = new ListNode(1);
		length++;
		ListNode second = new ListNode(2);
		length++;
		ListNode third = new ListNode(3);
		length++;
		ListNode fourth = new ListNode(4);
		length++;

		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;

		last = fourth;

	}

	// print
	public void print() {
		ListNode first = last.next;
		while (first != last) {
			System.out.print(first.data + " --> ");
			first = first.next;
		}
		System.out.print(first.data + " ");
		System.out.println();
	}

	// insert at the begining
	public void insertFirst(int data) {
		ListNode newNode = new ListNode(data);
		if (last == null) {
			last = newNode;
			last.next = newNode;
		} else {
			newNode.next = last.next;
		}
		last.next = newNode;
		length++;
	}

	// insert at last;
	public void insertLast(int data) {
		ListNode newNode = new ListNode(data);
		if (last == null) {
			last = newNode;
			last.next = newNode;
		} else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
		length++;
	}

	// remove first
	public ListNode removeFirst() {
		ListNode temp = last.next;
		if (last == null) {
			return null;
		} else {

			last.next = temp.next;

		}
		temp.next = null;
		length--;
		return temp;

	}

	// remove last
	public ListNode removeLast() {
		ListNode current = last.next;
		ListNode previous = null;
		if (last == null) {
			return null;
		} else if (current.next == last) {
			return current;
		} else {
			while (current.next != last.next) {
				previous = current;
				current = current.next;
			}
			previous.next = last.next;
			last = previous;
			current.next = null;
		}
		length--;
		return current;
	}
	// insert at particular position

	public void insertAtAnyPosition(int position, int data) {
		ListNode current = last.next;
		ListNode previous = null;
		int count = 0;
		ListNode newNode = new ListNode(data);
		while (count < position - 1) {
			previous = current;
			current = current.next;
			count++;
		}
		previous.next = newNode;
		newNode.next = current;
		length++;
	}
	// delete at particular

	public ListNode deleteatAnyPosition(int position) {
		ListNode current = last.next;
		ListNode previous = null;
		int count = 0;
		while (count < position - 1) {
			previous = current;
			current = current.next;
			count++;
		}
		previous.next = current.next;
		length--;
		return current;

	}

	// reverse CLL
	public void reverse() {
		ListNode current = last.next;
		ListNode nextNode = current.next;
		while(current != last) {
			ListNode previous = current;
			current = nextNode;
			nextNode = current.next;		
			current.next = previous;
		}
		nextNode.next= last;
		last=nextNode;
	}

	public static void main(String[] args) {
		CirculerSigalyLinkList cll = new CirculerSigalyLinkList();
		cll.createCLL();
		cll.insertFirst(5);
		cll.insertLast(6);
		cll.insertAtAnyPosition(3, 8);
		System.out.println(cll.deleteatAnyPosition(3).data);
		cll.print();
		// System.out.println(cll.removeFirst().data);
		// System.out.println(cll.removeLast().data);
		cll.reverse();
		cll.print();
		System.out.println(cll.length());
	}

}
