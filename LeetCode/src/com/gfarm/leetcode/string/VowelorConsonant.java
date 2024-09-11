package com.gfarm.leetcode.string;

import java.util.Set;

public class VowelorConsonant {

	

	private static void vowelorConsonant(String str) {
		Set<Character> set = Set.of('a','e','i','o','u');
		int vowelCount =0;
		int consonantCount =0;
		for(char c : str.toCharArray()) {
			if(set.contains(c)) {
				System.out.println("is vowel " + c);
				vowelCount++;
			}else {
				System.out.println("charactor is consonant " + c);
				consonantCount++;
			}
		}
		System.out.println("vowel count is "+ vowelCount);
		System.out.println("consonant count is "+ consonantCount);
		
	}
	
	private static void vowelorConsonant1(String str) {
		
		int vowelCount =0;
		int consonantCount =0;
		for(char c : str.toCharArray()) {
			if(isVowel(c)) {
				System.out.println("is vowel " + c);
				vowelCount++;
			}else {
				System.out.println("charactor is consonant " + c);
				consonantCount++;
			}
		}
		System.out.println("vowel count is "+ vowelCount);
		System.out.println("consonant count is "+ consonantCount);
		
	}
	
	private static boolean isVowel(char c) {
		c = Character.toUpperCase(c);
		return (c=='A'||c=='E'||c=='I'||c=='o'||c=='U');
	}

	public static void main(String[] args) {
		
		String str ="chetan";
		vowelorConsonant1(str);

	}

}
