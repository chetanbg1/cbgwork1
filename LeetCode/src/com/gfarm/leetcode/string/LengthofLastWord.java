package com.gfarm.leetcode.string;

public class LengthofLastWord {

//thoughts before code
	//check the characters from right to left
	//we should note that there may be trailing spaces inside the input string
	//skip all the trailing spaces before we start counting characters
//pseudo code
	//i our current location , initially s.length()-1  -> right to left
	//length the length of last word
	//while 'i' is greater than or equal to 0 and the current character at 'i' == space 
	//decrement i
	//while 'i' is greater than or equal to 0 and the current character at 'i' != space 
	//decrement i and increment length 
	//return length
//time complexity 
	//O(n)  ,n - length of the input string
//space complexity - O(1)
	
	public static int lengthOfLastString(String s) {
		int i = s.length()-1;
		int lenght =0;
		while(i>=1 && s.charAt(i) == ' ') {
			i--;
		}
		while(i>=1 && s.charAt(i) != ' ') {
			lenght++;
			i--;
		}
		
		return lenght;
		
	}
	
	public static void main(String[] args) {
		String s = "hello world";
		System.out.println(lengthOfLastString(s));

	}

}
