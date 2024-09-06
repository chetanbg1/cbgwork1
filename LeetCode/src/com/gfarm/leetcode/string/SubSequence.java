package com.gfarm.leetcode.string;
//a sub sequence is string is a new string formed from the original string by deleting some or no 
// char without changing the order of remaining characters

public class SubSequence {
	
	public static boolean isSubseq(String str, String seq) {
		int i=0;  // create variable i=0 - to traverse original string 
		int j=0;		// create variable j=0 - to traverse sequence string
		while(i< str.length() && j<seq.length()) { 
			if(str.charAt(i)== seq.charAt(j)) {  //if chat at i an dchar at j are same 
				j++;  // increment j
			}
			i++; //else keep incrementing i
		}
		return j==seq.length(); // return true when j = length of sequence 
	}
	public static void main(String[] args) {
		
    System.out.println(isSubseq("abcde", "aec"));
	}

}
