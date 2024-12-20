package com.gfarm.leetcode.number;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//Q - "3322251" --> two3's + three 2's + one 5 + one 1 == 2 3+ 3 2+ 1 5+ 1 1 = "23321511"
public class CountAndSay {

//thought before coding
	// we will implement a recursive approach
	// for each of the number 'n'
	// we will first want to find the count and for (prev) 'n-1'
	// then for each of the characters 'c' inside the 'prev'
	// we want to keep track of the consecutive frequency of 'c' inside prev
	// then if we are at the end of the string or the next character does not equal
	// to 'c'
	// we have to append the count and 'c' to our resulting string
//Pseudo code
	// implement a recursive approach
	// parameters
	// n- current number we are processing
	// base case
	// if 'n'==1 return '1'
	// in each of the recursive call
	// recursively find the previous string for 'n-1' , n ==> n-1
	// create a stringBuilder 'current' to keep track of count and say for 'n'
	// create variable 'count' to keep track of the frequency
	// iterate through the previous string denoted as 'i' , - increment count
	// if 'i' is at last index or the character at 'i+1' does not equal to the
	// current character at 'i'
	// append the count to the to current
	// reset the count to 0
//time complexity
	// O(n*k), where n - length of input value and k - is the average length of each
	// string
	// O(n*k) there are up to 'n' iterative calls, and we iterate through K indices
	// each
//space complexity 
	// O(n)+O(n*k)
	// O(n) - recursive call stack memory
	// O(n*k) - the generated strings in each recursive call

	public static String countAndSay(int n) {
		String s = "1";
		for (int i = 1; i < n; i++) {
			s = countAndSayHelper(s);
		}
		return s;
	}

	private static String countAndSayHelper(String s) {
		StringBuilder sb = new StringBuilder();  // create a string builder to store result
		char prev = s.charAt(0);  // create variable prev store char at index 0 in it 
		int count = 1; // create variable count = 1
		for (int i = 1; i < s.length(); i++) { //traverse the string from 2nd index
			if (s.charAt(i) == prev) {  //if element at current index is = prev
				count++;   //increase the count
			} else {
				sb.append(count).append(prev);  // else append count in result string sb also append the prev 
				prev = s.charAt(i); // set prev to current index
				count = 1;  // set count again to 1
			}
		}
		//sb.append(count).append(prev); 
		return sb.toString();
	}

	public static String compressString(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1); 
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		//System.out.println(countAndSay(3322251));
		
		System.out.println(compressString("aaabbcccd"));

	}

}
