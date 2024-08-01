package com.gfarm.recursion;

public class RemoveDuplicate {
	public static boolean[] map =new boolean[26];
	
	public static void removeDuplicate(String str, int idx, String newString) {
		if(idx ==str.length()) {
			System.out.println(newString);
			return;
		}
		char currentChar = str.charAt(idx);
		if(map[currentChar-'a']==true) {
			removeDuplicate(str, idx+1, newString);
		}else {
			newString += currentChar;
			map[currentChar-'a'] = true;
			removeDuplicate(str, idx+1, newString);
		}
	}
	public static void main(String[] args) {
		String str ="aabcgddy";
		removeDuplicate(str, 0, "");

	}

}
