package com.gfarm.leetcode.string;

public class VowelCount {

	public static int countVowels(String str) {
		
		char [] ch = str.toCharArray();
		int count =0;
		for(char c : ch) {
			switch (c) {
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': 
				count++;
				break;
				
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		
		String str = "asdfghjklmnb vczxqwer yuoikpal";
	
		System.out.println(str.replaceAll("\\s", ""));
		System.out.println(countVowels(str));
	}

}
