package com.gfarm.leetcode.string;

import java.util.Set;

public class RemoveVowels {
	
	public static String removeVowels(String str) {
		Set<Character> vowels = Set.of('a','e','i','o','u'); //create set and add vowels in it 
		StringBuilder sb = new StringBuilder(); // sb to store the result 
		
		char[] chars = str.toCharArray(); //convert string to char array
		for(char ch : chars) {   //traverse array
			if(!vowels.contains(ch)) { //check if set contain it or not
				sb.append(ch);  //only append the elements not in the set
			}
		}
		return sb.toString();  //return in string format
	}
	public static void main(String[] args) {
		System.out.println(removeVowels("icecream"));
	}

}
