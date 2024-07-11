package com.cbg.array;

public class PalindromString {

	public static void main(String[] args) {
		String word ="that";
		if(isplaindrom(word)) {
			System.out.println("string is palindrom");
		}else 
			System.out.println("string is not palindrom");
	}

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
