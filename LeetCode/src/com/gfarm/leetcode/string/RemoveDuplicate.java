package com.gfarm.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static String removeDuplicates(String str) {
		Set<Character> set = new HashSet<>(); 
		StringBuilder sb = new StringBuilder(); // sb to store the result 
		
		char[] chars = str.toCharArray(); //convert string to char array
		for(char ch : chars) {   //traverse array
			if(!set.contains(ch)) { //check if set contain it or not
				set.add(ch);	//add into the set
				sb.append(ch);  //only append the elements not in the set
			}
		}
		return sb.toString();  //return in string format
	}
	public static void main(String[] args) {
		
		System.out.println(removeDuplicates("aabbsbdd"));
	}

}
