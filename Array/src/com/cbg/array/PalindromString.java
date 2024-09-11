package com.cbg.array;

public class PalindromString {

	public static void main(String[] args) {
		String word ="that";
		if(isplaindrom(word)) {
			System.out.println("string is palindrom");
		}else 
			System.out.println("string is not palindrom");
	}

	//use two pinter approach 
	//convert the string into character array
	//start i from 0 , j from last index of array
	//while i is less than j
	//check whether the element at i is equal to element at j
	// increment i , i++ / decrement j, j--
	// if not return false else true
	private static boolean isplaindrom(String word) {
		char [] arr = word.toCharArray();
		
		int start =0;
		int end = arr.length-1;
		
		while(start< end) {
			if(arr[start]!=arr[end]) {
				return false;
			}
			start ++;
			end --;
		}
		return true;
	}

}
