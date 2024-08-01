package com.gfarm.leetcode.trie;


//Q - find the longest string in word such that every prefix of it is also in a words

public class LongestWordWithAllPrefixes {
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
	//
	public static String ans = "";
	public static void longestWord(TrieNode root , StringBuilder temp) {
		if(root == null) {
			return;
		}
		for(int i=0 ;i<26;i++) {
			if(root.children[i] != null && root.children[i].isWord ==true) {
				temp.append((char)(i+'a'));
				if(temp.length() > ans.length()) {
					ans = temp.toString();
				}
				longestWord(root.children[i], temp);
				temp.deleteCharAt(temp.length()-1);
			}
		}
	}
	public static void main(String[] args) {
		String words[] = {"a","banana","appl","apply","apple"};
		for (String word : words) {
			insert(word);
			System.out.println("inserted");
		}
		longestWord(root, new StringBuilder(""));
		System.out.println(ans);

	}

}
