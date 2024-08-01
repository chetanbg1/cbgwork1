package com.gfarm.recursion;

public class SubSequence {
	
	public static void subSequences(String str, int idx, String newSgring) {
		if(idx ==str.length()) {
		System.out.println(newSgring);
		return;
		}
		char currentChar = str.charAt(idx);
		//wanted to be included
		subSequences(str, idx+1, newSgring+currentChar);
		//or not to be
		subSequences(str, idx+1, newSgring);
	} 
	public static void main(String[] args) {
		String str = "abc";
		subSequences(str, 0, "");

	}

}
