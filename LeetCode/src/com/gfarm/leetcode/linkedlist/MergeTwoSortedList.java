package com.gfarm.leetcode.linkedlist;

//Q - merge two sorted linked list and return sorted list
public class MergeTwoSortedList {
	
	
	public static void main(String[] args) {
	
	}

// thought before code
	// we can implement two pointer approach
	// one pointer inside 'l1'
	// and second inside 'l2'
	// in each of the iteration we will be comparing node values from l1 and l2
	// we will retrieve the smaller node value and append it in our merged sorted
	// list
//sudo code
	// create following variables
	// head - head of merged sorted list
	// tail - tail of sorted list
	// while 'l1' or 'l2' is not equal to null
	// if 'l1' is not null OR 'l2' is not null AND l1.val is less than l2.val append
	// the l1.val in merged list
	// else append l2.val in merged list
	// set tail.next = 'l1'
	// set tail to 'l1'
	// set 'l1' to 'l1.next'
	// else
	// set tail.next = 'l2'
	// set tail to 'l2'
	// set 'l2' to 'l2.next'
	// return head.next
//time complexity 
	//O(m+n) , m,n are length of list 
	//visits each node once
//space complexity 
	//O(1)
}
