package com.gfarm.trie;

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode(); // root is empty
	}

	private class TrieNode {
		private TrieNode[] children; // size - 26
		private boolean isword;

		public TrieNode() {
			this.children = new TrieNode[26]; // a-z
			for (int i = 0; i < 26; i++) {
				children[i] = null;
			}
			this.isword = false;
		}
	}

	public void insert(String word) { // O(L) - length of word
		if (word == null || word.isEmpty()) {
			throw new IllegalArgumentException("invalid input");
		}
		word = word.toLowerCase();
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a'; // word.charAt(i) - 'a';
			if (current.children[index] == null) { // if word not exist
				TrieNode node = new TrieNode(); // create new node
				current.children[index] = node; // insert
				current = node; // move root to child
			} else {
				current = current.children[index]; // word exist
			}
		}
		current.isword = true;
	}

	// insert2
	public void insert1(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (current.children[idx] == null) {
				current.children[idx] = new TrieNode();
			}
			if (i == word.length() - 1) {
				current.children[idx].isword = true;
			}
			current = current.children[idx];
		}
	}

	// search
	public boolean search(String key) {
		TrieNode current = root;
		for (int i = 0; i < key.length(); i++) {
			int idx = key.charAt(i) - 'a';
			TrieNode node = current.children[idx];
			if (node == null) {
				return false;
			}
			if (i == key.length() - 1 && node.isword == false) {
				return false;
			}
			current = current.children[idx];
		}
		return true;
	}

	public static void main(String[] args) {
		Trie trie = new Trie();
//		trie.insert("cat");
//		trie.insert("cab");
//		System.out.println("inserted");

		String words[] = { "the", "a", "there", "their", "any" };
		for (int i = 0; i < words.length; i++) {
			trie.insert1(words[i]);
			System.out.println("inserted");
		}
		
		System.out.println(trie.search("theu"));

	}

}
