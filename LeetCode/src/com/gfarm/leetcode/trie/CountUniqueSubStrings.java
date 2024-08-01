package com.gfarm.leetcode.trie;

import com.gfarm.leetcode.trie.WordBreakProblem.TrieNode;

//Q - given a string of length n , count the number of distinct substrings of the string

public class CountUniqueSubStrings {
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
	public static boolean search(String key) {
		TrieNode curr = root;
		for (int i = 0; i < key.length(); i++) {
			int idx = key.charAt(i) - 'a';

			if (curr.children[idx] == null) {
				return false;
			}
//			if (i == key.length() - 1 &&  curr.children[idx].isWord == false) {
//				return false;
//			}
			curr = curr.children[idx];
		}
		return curr.isWord == true;
	}
	
	//count
	public static int countNode(TrieNode root) {
		if(root == null) {
			return 0;
		}
		int count =0;
		for(int i =0;i<26;i++) {
			if(root.children[i] !=null) {
				count += countNode(root.children[i]);
			}
		}
		return count +1;
	}
	public static void main(String[] args) {
		String str = "ababa";
		
		for(int i=0;i<str.length();i++) {
			String suffix = str.substring(i);
			System.out.println(suffix);
			insert(suffix);
			System.out.println("inserted");
		}
		System.out.println(countNode(root));
	}

}
