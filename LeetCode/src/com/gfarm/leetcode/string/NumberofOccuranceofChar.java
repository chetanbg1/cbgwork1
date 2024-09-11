package com.gfarm.leetcode.string;

public class NumberofOccuranceofChar {

	
	private static int numberofOccurance(String str, String target ) {
		
		int originalLenght = str.length();
		String newStr = str.replaceAll(target, "");
		int newLength = newStr.length();
		
		int result = originalLenght - newLength;
		
		return result;
	}
	public static void main(String[] args) {
		
		String str ="hello world";
		String target = "l";
		System.out.println(numberofOccurance(str, target));

	}

	

}
