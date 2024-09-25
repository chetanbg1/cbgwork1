package com.gfarm.leetcode.string;

import java.util.HashSet;
import java.util.Set;

//return the longest substring without repeating the characters 
public class LongestSubString {

	private static String longestSubString(String s) {
		String longest = "";
		String current = "";
		int j =0;
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < s.length();) {
			char c = s.charAt(i);
			if (set.contains(c)) {
				current = "";
				set.clear();
				i=++j;
			}else {
				set.add(c);
				current+=c;
				++i;
			}
		}
		if(current.length()> longest.length()){
			longest = current;
		}

		return longest;
	}
	
	public static int lenghtofLongetsSubString(String s) {
		int i=0;
		int j=0;
		int max =0;
		HashSet<Character> set = new HashSet<>();
		
		while(j < s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				max = Math.max(max, set.size());
			}else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		return max;
	}
	
	public static String LongetsSubString3(String s) {
		int i=0;
		int j=0;
		int max =0;
		HashSet<Character> set = new HashSet<>();
		
		while(j < s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				max = Math.max(max, set.size());
			}else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		return s.substring(i, j);
	}
	
	public static String longetsSubString1(String s) {
		int i=0;
		int j=0;
		
		String current ="";
		String longest ="";
		HashSet<Character> set = new HashSet<>();
		
		while(j < s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				current += s.charAt(j);
				j++;
				
			}else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		if(current.length()> longest.length()){
			longest = current;
		}

		return longest;
	}


	public static void main(String[] args) {
		String s = "abcefgdab";
		System.out.println(longestSubString(s));
		System.out.println(lenghtofLongetsSubString(s));
		System.out.println(longetsSubString1(s));
		System.out.println(LongetsSubString3(s));
	}

}
