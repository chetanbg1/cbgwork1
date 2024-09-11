package com.gfarm.leetcode.string;

public class AllSubStrings {

	public static void subSequences(String str, int idx, String newSgring) {
		if (idx == str.length()) {
			System.out.println(newSgring);
			return;
		}
		char currentChar = str.charAt(idx);
		// wanted to be included
		subSequences(str, idx + 1, newSgring + currentChar);
		// or not to be
		subSequences(str, idx + 1, newSgring);
	}

	public static void allSubStrings(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static void main(String[] args) {

		String str = "abc";

		allSubStrings(str);
		System.out.println("----------------------------");
		subSequences(str, 0, "");

	}

}
