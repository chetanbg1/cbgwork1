package com.gfarm.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	
	public static int firstNonRepeatingChar(String str) {
		Map<Character, Integer> charFrequencyMap = new HashMap<>();//create a map to check frequency
		char[] chars =str.toCharArray(); //convert string into char array
		for(char ch: chars) {
			charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0)+1);
		}
		for(int i = 0; i < chars.length;i++) {
			char ch = chars[i];
			if(charFrequencyMap.get(ch)==1) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		System.out.println(firstNonRepeatingChar("racecars"));
	}

}
