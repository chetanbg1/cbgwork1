package com.gfarm.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

	// every char in string is non repeating
	static boolean isIsogram(String s) {
		boolean isogram = true;
		char[] ch = s.toCharArray(); //convert the string in char array
		Set<Character> set = new HashSet<>();  // create set to check duplicate char 
		for (Character c : ch) {  //traverse through the character array
			if (set.contains(c)) {   //check if set contains that char
				isogram = false;     //if contains return false
			} else {			//if not add the character
				set.add(c);
			}
		}
		return isogram;
	}

	public static void main(String[] args) {
		System.out.println(isIsogram("chetan"));
	}

}
