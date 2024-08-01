package com.gfarm.leetcode.string;
//a sub sequence is string is a new string formed from the original string by deleting some or no 
// char without changing the order of remaining characters

public class SubSequence {
	
	public static boolean isSubseq(String str, String seq) {
		int i=0;
		int j=0;
		while(i< str.length() && j<seq.length()) {
			if(str.charAt(i)== seq.charAt(j)) {
				j++;
			}
			i++;
		}
		return j==seq.length();
	}
	public static void main(String[] args) {
		
    System.out.println(isSubseq("abcde", "aec"));
	}

}
