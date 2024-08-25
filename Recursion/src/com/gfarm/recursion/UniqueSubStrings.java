package com.gfarm.recursion;

import java.util.HashSet;

public class UniqueSubStrings {
	
	public static void uniqueSubSequences(String str, int idx, String newString, HashSet<String> set) {
		if(idx==str.length()) {
			if(set.contains(newString)) {
				return;
			}else {
			System.out.println(newString);
			set.add(newString);
			return;
			}
		}
		
		char curreentChar = str.charAt(idx);
		
		//to be
		uniqueSubSequences(str, idx+1, newString+curreentChar, set);
		//not to be
				uniqueSubSequences(str, idx+1, newString, set);
	} 
	public static void main(String[] args) {
		String str = "aaa";
		HashSet<String > set = new HashSet<>();
		uniqueSubSequences(str, 0, "", set);

	}

}
