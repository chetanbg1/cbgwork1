package com.gfarm.hash;

import java.util.Iterator;
import java.util.Set;

public class HashTable {
	
	private HashNode [] bucket;
	private int numOfBuckets;				// capacity of array
	private int size;						// no of K V pair
	
	
	public HashTable() {
		this(10);		//default capacity
	}
	public HashTable(int capacity) {
		this.numOfBuckets = capacity;
		this.bucket = new HashNode[numOfBuckets];
		this.size = 0;
	}
	
	private class HashNode{
		private Integer key;
		private String value;
		private HashNode next;
		
		public HashNode(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
	}
	
	//size
	public int size(){
	 	return size;
	}
	//is empty
	public boolean isEmpty() {
		return size ==0;
	}
	
	// hash function  modular 
	public int getBucketIndex(Integer key) {
		return key % numOfBuckets;
	}
	public void put(Integer key, String value) {
		if(key ==null || value==null) {
			throw new IllegalArgumentException("yede.. this is null");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = bucket[bucketIndex];
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = bucket[bucketIndex];
		HashNode node = new HashNode(key, value);
		node.next = head;
		bucket[bucketIndex] = node;
	}
	// get value
	
	public String get(Integer key) {
		if(key ==null) {
			throw new IllegalArgumentException("yede.. this is null");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = bucket[bucketIndex];
		while(head!= null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	//remove value
	public String remove(Integer key) {
		int bucketIndex = getBucketIndex(key);
		HashNode head = bucket[bucketIndex];
		HashNode previous = null;
		while(head!=null) {
			if(head.key.equals(key)) {
				break;
			}
			previous = head;
			head = head.next;
		}
		if(head == null) {
			return null;
		}
		size --;
		if(previous != null) {
			previous.next = head.next;
		}else {
			bucket[bucketIndex] = head.next;
		}
		return head.value;
	}
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.put(1, "aaaa");
		ht.put(2, "bbbb");
		ht.put(3, "cccc");
		ht.put(4, "dddd");
		
		System.out.println(ht.get(4));
		System.out.println(ht.remove(4));
		System.out.println(ht.size);

	}

}
