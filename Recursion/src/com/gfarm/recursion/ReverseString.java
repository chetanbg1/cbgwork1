package com.gfarm.recursion;

public class ReverseString {
	
	public static void reverse(String str,int index) {
		if(index ==0) {
			System.out.println(str.charAt(index));
			return;
		}
		System.out.println(str.charAt(index));
		reverse(str, index-1);
	}
	public static void main(String[] args) {
		String str ="abcd";
		reverse(str, str.length()-1);
	}

}
