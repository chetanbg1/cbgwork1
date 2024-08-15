package com.gfarm.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

	// every char in string is non repeating
	static boolean isIsogram(String s) {
		boolean isogram = true;
		char[] ch = s.toCharArray();
		Set<Character> set = new HashSet<>();
		for (Character c : ch) {
			if (set.contains(c)) {
				isogram = false;
			} else {
				set.add(c);
			}
		}
		return isogram;
	}

	public static void main(String[] args) {
		System.out.println(isIsogram("chetan"));
	}

}
