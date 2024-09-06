package com.gfarm.leetcode.string;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateChars {

	public static void main(String[] args) {

		System.out.println(findDuplicatesUsingFor("cheetanch"));
		System.out.println(findDuplicateUsingArray("cheetanch"));
		System.out.println(findDuplicateUsingMap("cheetanch"));

	}

	// using for loop O(n^2)
	private static Set<Character> findDuplicatesUsingFor(String string) {
		Set<Character> duplicate = new LinkedHashSet<>();  //create a set of characters to return result
		for (int i = 0; i < string.length(); i++) {  //traverse through the string
			for (int j = i + 1; j < string.length(); j++) {  // send for starts from i+1
				if (string.charAt(i) == string.charAt(j)) {  //if i==j add in set
					duplicate.add(string.charAt(i));
				}
			}
		}
		return duplicate;
	}
	
	//using array O(n) + O(n) = O(2n) --> O(n)
	//problem is space complexity as we are using array of 256 length 
	private static Set<Character> findDuplicateUsingArray(String string) {
		Set<Character> duplicate = new LinkedHashSet<>(); // to store duplicates
		int [] arrayForChar = new int[256]; // to store the assci value
		for(int i =0;i<string.length();i++) {
			arrayForChar[string.charAt(i)] = arrayForChar[string.charAt(i)]+1;
		}
		for(int i=0;i<256;i++) {//order will be alphabetic/ asc as we are iterating on assci array 
			if(arrayForChar[i] > 1) {
				duplicate.add((char) i);
			}
		}
		return duplicate;
	}
	//using map O(n) 
	// space complexity is reduce to length of string 
	
	private static Set<Character> findDuplicateUsingMap(String string) {
		Set<Character> duplicate = new LinkedHashSet<>();
		HashMap<Character, Integer> countMap = new HashMap<>();
		for(int i =0;i<string.length();i++) {
			if(countMap.containsKey(string.charAt(i))) {
				//if already exist update the value by +1
				countMap.put(string.charAt(i), countMap.get(string.charAt(i))+1);
			}else {
				countMap.put(string.charAt(i), 1);//for the first time add it
			}
		}
		for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if(entry.getValue() > 1) {
				duplicate.add(entry.getKey());
			}
		}
		return duplicate;
	}

}
