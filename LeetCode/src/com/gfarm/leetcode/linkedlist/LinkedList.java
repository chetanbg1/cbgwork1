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
	
	//given the head of two single linked lists, find the their intersection point
	//brute force
	//1- compare each element of 1st string with every other element of 2nd string,check where
	// we get the same element return that
	//2 - put the 1st list into hashset then check elements from 2nd list contained in hashset or not
	//efficient solution
	//calculate the length of strings
	// subtract the lengths, get the heads at the same position as smaller list
	// traverse both of the list, check where both intersects
	//time complexity - O(n+m)
	//space complexity - O(1)
	public static Node intersection(Node headA, Node headB) {
		int lengthA = getListLength(headA);
		int lengthB = getListLength(headB);
		
		while(lengthA > lengthB) {
			lengthA--;
			headA = headA.next;
		}
		
		while(lengthA < lengthB) {
			lengthB--;
			headB = headB.next;
		}
		//now both the heads are at same distance from intersection
		//start moving both until they meet
		while(headA.data != headB.data) {
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}
	
	private static int getListLength(Node head) {
		int length =0;
		Node current = head;
		while(current.next!=null) {
			length++;
			current = current.next;
		}
		return length;
	}

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.insertLast(1);
		l1.insertLast(2);
		l1.insertLast(8);
		l1.insertLast(5);
		l1.insertLast(6);
		l1.insertLast(7);
		l1.print();
		
		LinkedList l2 = new LinkedList();
		l2.insertLast(3);
		l2.insertLast(4);
		l2.insertLast(5);
		l2.insertLast(6);
		l2.insertLast(7);
		l2.print();
//		
//		LinkedList result = new LinkedList();
//		//result.head = result.mergeTwoList(l1.head, l2.head);
//		result.head = result.merge(l1.head, l2.head);
//		result.print();
		
		System.out.println(intersection(l1.head, l2.head).data);
	}

}
