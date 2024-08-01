package com.gfarm.leetcode.trie;

//Q - given an input string and a dictionary of words, find out if input string can broken
//into a space-separated sequence of dictionary words

//find all possible subStrings of key
public class WordBreakProblem {
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
		curr.isWord =true;
	}

	// search
	public static boolean search(String key) {
		TrieNode curr = root;
		for (int i = 0; i < key.length(); i++) {
			int idx = key.charAt(i) - 'a';
			
			if ( curr.children[idx] == null) {
				return false;
			}
//			if (i == key.length() - 1 &&  curr.children[idx].isWord == false) {
//				return false;
//			}
			curr =  curr.children[idx];
		}
		return curr.isWord==true;
	}

	// word break
	public static boolean wordBreak(String key) {
		if (key.length() == 0) {
			return true;
		}
		for (int i = 1; i <=key.length(); i++) {
//			String firstPart = key.substring(0, i);
//			String secondPart =key.substring(i);
//			if(search(firstPart) && wordBreak(secondPart)) {
			if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String[] words = { "i", "like", "sam", "samsung", "mobile" };

		String key = "ilikesamsung";
		for (String word : words) {
			insert(word);
			System.out.println("inserted");
		}
		System.out.println(wordBreak(key));
	}

}
