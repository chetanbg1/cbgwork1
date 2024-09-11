package com.gfarm.leetcode.string;

import java.util.Arrays;
import java.util.Scanner;

public class CountWordinString {

	
	private static int countNumberOfWords(String str) {
		int count =0;
		if(str.charAt(0)!=' ') {
			count++;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str = sc.nextLine();
		
		String str = "i am learning java";
		
		System.out.println(countNumberOfWords(str));
		
		long count = Arrays.stream(str.split("\\s")).count();
		System.out.println(count);

	}

	

}
