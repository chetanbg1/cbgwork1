package com.gfarm.leetcode.string;

public class StringRotation {

	public static void main(String[] args) {
		String originalstring = "chetan";
		
		String tobechecked = "anchet";
		
		System.out.println(checkrotation(originalstring , tobechecked));

	}

	private static boolean checkrotation(String originalstring, String tobechecked) {
		// add the original string twice create new string
		String concatinatedString = originalstring + originalstring;
		// check in concatinatedString whether the string tobechecked is substring of it or not 
		if(concatinatedString.contains(tobechecked)) {
			return true;
		}
		return false;
		
	}

}
