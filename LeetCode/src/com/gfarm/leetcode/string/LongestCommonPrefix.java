package com.gfarm.leetcode.string;

//Q - write a function to find the longest common prefix string amongst an array of string
// if no common return ""
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String [] strs = {"flower","flow","flight"};

		 String str= longestCommonPrefix(strs);
		 System.err.println(str);

	}

//thought before coding
	// initially we have the longest common prefix length which is equal to length
	// of 1st word
	// we will compare 1st word with every other word
	// but, we will compare up to the index up ot length
	// because there is no point for checking for charactors after this index
	// ["flower","flow","flight"]
	// initially we have a length of '6'
	// we will only compare the indices from 0 to 5
	// 'flower' with 'flow'
	// since 'flow' has a shorter length than 6
	// we need to update '6' to '4'
	// so we only compare chars from 0 to 3
	// our current length is 4
	// compare'flow' and 'flight'
	// we will need to update our length to 2 as there is mismatch in chars
	// we can generate substring from 0 to 1

//sudo code
	// validate the input
	// if strs is empty return 0;
	// create the variable 'length' to keep update of the current longest common
	// prefix length
	// initially "strs[0].lenght()"
	// iterate through the indices from 1 -> strs.length , denoted as i
	// update 'length' 'strs[i].length' if current string has smaller length
	// iterate through the characters from 0 -> length-1 denoted as 'j'
	// retrieve the characters 'c' and 'd' from 'strs[0]' and 'strs[i]'
	// if 'c' does not equal to 'd' we need to update the length to 'j'
	// break the loop
	// return a substring from the first word from 0 to length-1

// time complexity 
	// O(n*k) + O(k) = O(n*k)
	// where n = number of strings , k = number of characters associated with
	// strings
	// O(n*k) compare the first string with every other string
	// o(k) generate result substring
//space complexity 
	// O(k) k - number of characters associated with each string
	// O(k)- resulting substring

	private static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";

		int length = strs[0].length();

		for (int i = 0; i < strs.length; i++) {
			length = Math.min(length, strs[i].length());
			
			for(int j =0; j < length;j++) {
				char c = strs[0].charAt(j);
				char d = strs[i].charAt(j);
				
				if(c!=d) {
					length = j;
					break;
				}
			}
		}
		return strs[0].substring(0, length);

	}

}
