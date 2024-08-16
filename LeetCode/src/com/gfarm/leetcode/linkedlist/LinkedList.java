package com.gfarm.leetcode.linkedlist;



public class LinkedList {
	private Node head;
	//private Node tail;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			// this.next = next;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}

	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node curr = head;
			while (curr != null && curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;

		}
	}

	public void print() {
		Node cur = head;
		while (cur != null) {
			System.out.print(cur.data + " ->");
			cur = cur.next;
		}
		System.out.println();
	}

	private Node mergeTwoList(Node l1, Node l2) {
		Node head = new Node();
		Node tail = head;
		
		while(l1!= null || l2 != null) {
			if(l2 == null || (l1 != null && l1.data < l2.data)) {
				tail.next = l1;
				l1 = tail;
				l1 = l1.next;
			}else {
				tail.next = l2;
				l2 = tail;
				l2 = l2.next;
			}
		}
		return head.next;
	}

	public Node merge(Node a, Node b) {

		Node dummy = new Node(0);
		Node tail = dummy;
		while (a != null && b != null) {
			if (a.data <= b.data) {
				tail.next = a;
				a = a.next;
			} else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		if (a == null) {
			tail.next = b;
		} else {
			tail.next = a;
		}
		return dummy.next;
	}
	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.insertLast(1);
		l1.insertLast(2);
		l1.insertLast(4);
		l1.print();
		
		LinkedList l2 = new LinkedList();
		l2.insertLast(1);
		l2.insertLast(3);
		l2.insertLast(4);
		l2.print();
		
		LinkedList result = new LinkedList();
		//result.head = result.mergeTwoList(l1.head, l2.head);
		result.head = result.merge(l1.head, l2.head);
		result.print();
	}

}
