package com.gfarm.leetcode.trie;
//Q- create a function boolean startsWith(String prefix) for a trie.
//return true if there is a previously inserted string word that has the prefix prefix,
//abd false otherwise

public class WordStartsWith {
	static class TrieNode {
		TrieNode children[];
		boolean isWord;

		public TrieNode() {
			super();
			this.children = new TrieNode[26];
			this.isWord = false;
		}
	}

	public static TrieNode root = new TrieNode();

	// insert
	public static void insert(String word) {
		TrieNode curr = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (curr.children[idx] == null) {
				curr.children[idx] = new TrieNode();
			}
			curr = curr.children[idx];
		}
		curr.isWord = true;
	}

	// search
	public static boolean startWith(String key) {
		TrieNode curr = root;
		for (int i = 0; i < key.length(); i++) {
			int idx = key.charAt(i) - 'a';

			if (curr.children[idx] == null) {
				return false;
			}
			curr = curr.children[idx];
		}
		return true;
	}

	public static void main(String[] args) {
		String[] words = { "apple", "app", "mango", "man", "women"};

		//String key = "ilikesamsung";
		for (String word : words) {
			insert(word);
			System.out.println("inserted");
		}
		
		String prefix = "appk";
		System.out.println(startWith(prefix));

	}

}
