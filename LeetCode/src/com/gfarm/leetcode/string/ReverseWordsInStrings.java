package com.gfarm.leetcode.string;

public class ReverseWordsInStrings {

	public static void main(String[] args) {
		
		String str = "welcome to java world";
		String splitArray [] = str.split(" ");
		for(int i = splitArray.length-1;i>=0;i--) {
			System.out.println(splitArray[i]);
		}

	}

}
