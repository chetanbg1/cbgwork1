package com.gfarm.backtrack;

public class Permutations {
	//time complexity o(n*n!)
	public static void printPermutations(String str, int idx, String permutation) {
		if(str.length()==0) {
			System.out.println(permutation);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char currentChar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i+1);
			printPermutations(newStr, idx+1, permutation+currentChar);
		}
	}
	public static void main(String[] args) {
		
		String str ="abc";
		printPermutations(str, 0, "");

	}

}
