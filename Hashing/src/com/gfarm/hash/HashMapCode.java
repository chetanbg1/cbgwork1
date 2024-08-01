package com.gfarm.hash;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {
	static class HashMap1<K, V> {
		private class Node {
			K key;
			V value;

			public Node(K key, V value) {
				super();
				this.key = key;
				this.value = value;
			}

		}

		private int n; // total number of nodes
		private int N; // number of buckets
		private LinkedList<Node> buckets[]; // N = buckets.length
		// private --> access modifier
		// LinkedList<Node> --> type of array
		// buckets[] --> array name

		@SuppressWarnings("unchecked")
		public HashMap1() {
			this.N = 4;
			this.buckets = new LinkedList[4]; // initialized the array
			for (int i = 0; i < 4; i++) {
				this.buckets[i] = new LinkedList<>();// at each index/bucket created one linkedlist
			}
		}

		private int hashFunction(K key) {
			int bi = key.hashCode();
			return Math.abs(bi) % N;
		}

		private int searchInLL(K key, int bi) { // finds the data in LL and gives index
			LinkedList<Node> ll = buckets[bi]; // ll is linked list stored at index bi
			for (int i = 0; i < ll.size(); i++) {
				if (ll.get(i).key == key) {
					return i; // node index / di
				}
			}
			return -1;
		}

		// rehash
		@SuppressWarnings("unchecked")
		private void rehash() {
			LinkedList<Node> oldBucket[] = buckets; // store old array in new array called oldBucket
			buckets = new LinkedList[N * 2]; // increase the size of array

			for (int i = 0; i < N * 2; i++) {
				buckets[i] = new LinkedList<>();
			}
			for (int i = 0; i < buckets.length; i++) {
				LinkedList<Node> ll = oldBucket[i];
				for (int j = 0; j < ll.size(); j++) {
					Node node = ll.get(j);
					put(node.key, node.value);
				}

			}
		}

		public void put(K key, V value) {
			int bi = hashFunction(key); // bi = bucket Index
			int di = searchInLL(key, bi); // di = data/node index // checks whether the key is present or not

			if (di == -1) { // key does not exists
				buckets[bi].add(new Node(key, value));
				n++;
			} else { // key exist
				Node node = buckets[bi].get(di); // find the key and update
				node.value = value; // update the value
			}
			double lambda = (double) n / N;
			if (lambda > 2.0) {
				// rehashing -- increase the size of array
				rehash();
			}
		}

		// get
		public V get(K key) {
			int bi = hashFunction(key); // bi = bucket Index
			int di = searchInLL(key, bi); // di = data/node index // checks whether the key is present or not

			if (di == -1) { // key does not exists
				return null;
			} else { // key exist
				Node node = buckets[bi].get(di); // find the key and return
				return node.value;
			}
		}

		// contains
		public boolean containsKey(K key) {
			int bi = hashFunction(key); // bi = bucket Index
			int di = searchInLL(key, bi); // di = data/node index // checks whether the key is present or not

			if (di == -1) { // key does not exists
				return false;
			} else { // key exist
				return true;
			}
		}
		//remove
		public V remove(K key) {
			int bi =hashFunction(key); //bi = bucket Index
			int di =searchInLL(key, bi); //di = data/node index // checks whether the key is present or not
			
			if(di == -1) {  // key does not exists
				return null;
			}else {  //key exist
				Node node = buckets[bi].remove(di); //find the key and remove
				n--;
				return node.value;
			}
		}
		//isEmpty
		public boolean isEmpty(){
			return n ==0;
		}
		//keyset
		public ArrayList<K> keySet(){
			ArrayList<K> keys = new ArrayList<>();
			
			for(int i= 0; i < buckets.length;i++) {  //i = bucket index
				LinkedList<Node> ll = buckets[i];
				for(int j = 0 ; j<ll.size(); j++) {  //j = node index 
					Node node = ll.get(j);
					keys.add(node.key);
				}
			}
			return keys;
		}

	}

	public static void main(String[] args) {
		HashMap1<String, Integer> map = new HashMap1<>();
		map.put("India", 140);
		map.put("china", 120);
		map.put("usa", 100);
		
//		ArrayList<String> keys = map.keySet();
//		for(int i = 0; i< keys.size(); i++) {
//			System.out.println(keys.get(i) +" "+map.get(keys.get(i)));
//		}
		
		map.remove("china");
		System.out.println(map.get("china"));
		

	}

}
