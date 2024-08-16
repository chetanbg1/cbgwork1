package com.gfarm.leetcode.number;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrom(121));

	}
//thought before coding
	// a palindrome is string can be read same way forward and backwards
	// means if we reverse 'x'
	// reverse version of 'x' is equal to 'x'
	// we will implement a approch that does not require to convert int to string
	// we can create a variable to keep track of reverse from 'x'
	// process digit from right to left
	// in order to retrieve right 'digit' we can use modulus operator
	// digit = x%10
	// in order to append the digit in reverse multiply reverse by 10 and increment
	// by 'digit'
	// remove the right most digit of 'x' using division operator
	// 'x' = x/10;
	// after we process all the digits of 'x'
	// we will compare 'x' and 'reverse' if same then is palindrome else not

//sudo code
	// if 'x' is negative not a palindrome
	// return false
	// create two variable 
	// copy of 'x' we do not want to modify 'x' , 'x' and 'copy'
	// reverse  --reverse from 'x'
	// while copy id greater than zero 
	// retrieve the right most digit = copy % 10
	// multiply reverse by 10 and append the digit rev = rev *10 + 'digit'
	// remove rightmost digit copy = copy /10
	// return true if rev = x else retrun false
	
//time and space complexity
	//time complexity  = O(log x) , where x is the input value
	// processed each of the digit of 'x'
	//space complexity = O(1)
	
	private static boolean isPalindrom(int x) {
		if(x < 0) {return false;}
		int rev = 0;
		int num = x;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		if (x == rev) {
			return true;
		}
		return false;
	}

}
