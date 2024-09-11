package com.gfarm.leetcode.string;

public class WordReverse {

	public static void main(String[] args) {
		String s= "welcome to java world";
		
		String splitArr [] = s.split(" ");
		for(int i = splitArr.length-1; i>=0;i--) {
			System.out.println(splitArr[i]);
		}
		

	}

}
