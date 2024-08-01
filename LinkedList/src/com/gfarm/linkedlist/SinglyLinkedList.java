package com.gfarm.linkedlist;

import javax.security.auth.login.CredentialException;

public class SinglyLinkedList {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void length() {
		ListNode current = head;
		int length = 0;
		while (current != null) {

			length++;
			current = current.next;
		}
		System.out.print("length is " + length);
		System.out.println();
	}

	// insert at first
	public void insertFirst(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	// insert at last
	public void insertLast(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
			return;
		} else {
			ListNode current = head;
			while (null != current.next) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	// insert at any position

	public void insertAtAnyPosition(int data, int position) {
		ListNode node = new ListNode(data);
		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			node.next = current;
			previous.next = node;
		}
	}

	// remove first
	public ListNode removeHead() {
		if (head == null) {
			return null;
		} else {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		}
	}

	// remove last
	public ListNode removeLast() {
		if (head == null || head.next == null) {
			return head;
		} else {
			ListNode current = head;
			ListNode previous = null;
			while (current.next != null) {
				previous = current;
				current = current.next;
			}
			previous.next = null;
			return current;
		}
	}

	// remove from given position
	public void deleteAtPosition(int position) {
		if (position == 1) {
			head = head.next;
		} else {

			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;

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

	// reverse linklist iteration
	public ListNode reverse() {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	// reverse recursion
	public ListNode reverseRecursive(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}

	// middle of the link list
	public ListNode middle() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}

	// nth node from end
	public ListNode getNthNodeFromEnd(int n) {
		if (head == null) {
			return null;
		}
		if (n <= 0) {
			throw new IllegalArgumentException("invalid value n : " + n);
		}

		ListNode refNode = head;
		ListNode mainNode = head;
		int count = 0;

		while (count < n) {// - - - - - - -
			refNode = refNode.next;
			count++;
		}
		while (refNode != null) {
			refNode = refNode.next;
			mainNode = mainNode.next;
		}
		return mainNode;
	}

	// nth node from end 2nd solution
	public ListNode removeNthFromLast(int n) {
		if (head.next == null) {
			return null;
		}
		// size
		int size = 0;
		ListNode current = head;
		while (current != null) {
			current = current.next;
			size++;
		}
		if (size == n) {
			return head.next;
		}

		int nthindex = size - n + 1; // nth value from end
		int j = 1;
		ListNode curr = head;
		while (j < nthindex) {
			curr = curr.next;
			j++;
		}
		System.out.println("nth value from the end is :" + curr.data);

		int indexToSearch = size - n;
		int i = 1;
		ListNode prev = head;
		while (i < indexToSearch) {
			prev = prev.next;
			i++;
		}
		prev.next = prev.next.next;
		return head;

	}

	// remove duplicated from sorted list
	public void removeDuplicates() {
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			}
			current = current.next;
		}
	}

	// insert in sorted linked list
	public ListNode insertInSorted(int data) {
		ListNode newNode = new ListNode(data);

		ListNode current = head;
		ListNode temp = null;

		while (current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}

	// remove node in linked list
	public void removeKey(int key) {
		ListNode current = head;
		ListNode temp = null;
		if (current != null && current.data == key) {
			head = current.next;
			return;
		}
		while (current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		if (current == null)
			return;
		temp.next = current.next;

	}

	// is linked list contain loop
	public boolean isLoop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;

			if (slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}
	// linked list with loop

	public void loopLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);

		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}

	// finding starting point of loop
	public ListNode startingofLoop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr)
				return getStartingPoint(slowPtr);
		}
		return null;
	}

	// finding start of loop
	private ListNode getStartingPoint(ListNode slowPtr) {
		ListNode temp = head;
		while (slowPtr != temp) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp;
	}

	// break the loop in linkked list
	public void removeLoop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;

			if (slowPtr == fastPtr) {
				removeLoop(slowPtr);
				return;
			}
		}
	}

	private void removeLoop(ListNode slowPtr) {
		ListNode temp = head;
		while (slowPtr.next != temp.next) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
	}

	// merge two sorted linked list
	public ListNode merge(ListNode a, ListNode b) {

		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
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

	// adding two linked list
	public ListNode add(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		int carry = 0;
		while (a != null || b != null) {
			int x = (a != null) ? a.data : 0;
			int y = b != null ? b.data : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			tail.next = new ListNode(sum % 10);
			tail = tail.next;
			if (a != null)
				a = a.next;
			if (b != null)
				b = b.next;
		}
		if (carry > 0) {
			tail.next = new ListNode(carry);
		}
		return dummy.next;
	}

	// isPalindrom
	// middle of the LL
	// 2nd half reverse
	// check 1st and 2nd half
	public boolean isPalindrom(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode middleNode = findMiddle(head);// tells 1st half end
		ListNode secondHalfStart = reverse(middleNode.next);

		ListNode firstHalfStart = head;

		while (secondHalfStart != null) {
			if (firstHalfStart.data != secondHalfStart.data) {
				return false;	
			}
			firstHalfStart = firstHalfStart.next;
			secondHalfStart = secondHalfStart.next;
		}
		return true;
	}

	@SuppressWarnings("null")
	private ListNode findMiddle(ListNode head) {
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		while(fastPointer != null ) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return slowPointer;
	}

	private ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		return prev;
	}

	public static void main(String[] args) {
		SinglyLinkedList ssl = new SinglyLinkedList();
//		ssl.head = new ListNode(1);
//		ListNode second = new ListNode(1);
//		ListNode third = new ListNode(2);
//		ListNode fourth = new ListNode(3);
//		ssl.head.next = second;
//		second.next = third;
//		third.next = fourth;
		// fourth.next = second;

		ssl.insertFirst(1);
		ssl.insertLast(2);
		ssl.insertLast(2);
		ssl.insertLast(1);
		ssl.display();
		// ssl.head = ssl.reverseRecursive(ssl.head);
		//ssl.removeNthFromLast(2);
		System.out.println(ssl.isPalindrom(ssl.head));
		ssl.display();
//		ssl.length();
//		ssl.insertFirst(13);
//		ssl.insertLast(34);
//		ssl.insertAtAnyPosition(45,3);
//		ssl.display();
//		ssl.removeHead();
//		System.out.println(ssl.removeHead().data);
//		ssl.removeLast();
//		ssl.insertLast(3);
//		ssl.insertLast(35);
//		ssl.insertLast(45);
//		ssl.insertLast(56);
//		ssl.insertLast(88);
//		ssl.display();
//		System.out.println(ssl.removeLast().data);
//		ssl.deleteAtPosition(3);
//		ssl.display();
//		System.out.println((ssl.search(11).data));
//		ListNode reverseList = ssl.reverse();
//		ssl.display(reverseList);
//		ssl.display();
//		System.out.println(ssl.middle().data);
//		
//		System.out.println((ssl.getNthNodeFromEnd(4).data));
		// ssl.removeDuplicates();
		// ssl.insertInSorted(55);
		// ssl.removeKey(35);
//		ssl.loopLinkedList();
		// System.out.println(ssl.isLoop());
//		System.out.println((ssl.startingofLoop().data));
//		ssl.removeLoop();
//		System.out.println(ssl.isLoop());
//		ssl.display();
//		ListNode current = head;
//		while (current != null) {
//			System.out.print(current.data + "-> ");
//			current = current.next;
//		}
//		System.out.print("null");
//		System.out.println();

		// length of linked list
//		ListNode node = head;
//		int length = 0;
//		while (node != null) {
//			length++;
//			node = node.next;
//		}
//		System.out.println("length of linked list is " + length);

//		SinglyLinkedList ssl1 = new SinglyLinkedList();
//		ssl1.insertLast(1);
//		ssl1.insertLast(4);
//		ssl1.insertLast(8);
//
//		SinglyLinkedList ssl2 = new SinglyLinkedList();
//		ssl2.insertLast(3);
//		ssl2.insertLast(5);
//
//		SinglyLinkedList result = new SinglyLinkedList();

		// result.head = ssl.merge(ssl1.head, ssl2.head);
		// result.head = ssl.add(ssl1.head, ssl2.head);
		// result.display();

	}
}
