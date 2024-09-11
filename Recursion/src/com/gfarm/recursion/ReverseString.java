package com.gfarm.recursion;

public class ReverseString {
	
	public static void reverse(String str,int index) {
		if(index ==0) {  //base condition
			System.out.print(str.charAt(index));
			return;
		}
		System.out.print(str.charAt(index)); //extract the character from string
		reverse(str, index-1); //Recursively call the method with remaining string
	}
	
	public static String reverse(String str) {
		if(str ==null || str.length()<=1) {  //base condition
			return str;
		}
		
		return reverse(str.substring(1))+str.charAt(0);      //Recursively call the method with remaining string
	}
	public static void main(String[] args) {
		String str ="abcd";
		reverse(str, str.length()-1);
		System.out.println();
		System.out.println(reverse(str));
	}

}
