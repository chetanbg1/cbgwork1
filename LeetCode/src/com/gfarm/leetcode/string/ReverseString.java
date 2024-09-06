package com.gfarm.leetcode.string;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("abcd"));

	}

	private static String reverse(String str) {
		Stack<Character> stack = new Stack<>();  //create a stack of chars
		char[] chars = str.toCharArray(); //convert string in char array
		for(char c: chars) { // traverse array
			stack.push(c);  // puch each char in stack
		}
		for(int i=0;i<str.length();i++) {   // traverse stack 
			chars[i] = stack.pop();  // pop from stack and add in to char array
		}
		return new String(chars);  //return char array as string
		
	}
}
