package com.gfarm.leetcode.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

	public static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		Map<Character, Integer> map1 = getCharCount(str1);
		Map<Character, Integer> map2 = getCharCount(str2);

		return map1.equals(map2);
	}

	public static Map<Character, Integer> getCharCount(String str) {
		Map<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1); // if char is present increment the value by 1 or if not present add
													// into map
		}
		return map;
	}

	public static boolean areAnagrams(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		str1 = str1.toLowerCase().chars().sorted()
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
		str2 = str2.toLowerCase().chars().sorted()
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
		return str1.equals(str2);
	}

	public static boolean isitAnagrams(String str1, String str2) {

		char[] strs1 = str1.toCharArray();
		char[] strs2 = str1.toCharArray();

		Arrays.sort(strs1);
		Arrays.sort(strs2);

		return Arrays.equals(strs1 ,strs2);
	}

	public static void main(String[] args) {

		System.out.println(isAnagram("abcd", "dcba"));
		System.out.println(areAnagrams("abcdz", "dcbax"));
		System.out.println(isitAnagrams("abcd", "dcba"));

	}

}
