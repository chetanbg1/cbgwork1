package com.gfarm.leetcode.string;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {

	private static String reverse(String str) {
		Stack<Character> stack = new Stack<>();  //create a stack of chars
		char[] chars = str.toCharArray(); //convert string in char array
		for(char c: chars) { // traverse array
			stack.push(c);  // push each char in stack
		}
		for(int i=0;i<str.length();i++) {   // traverse stack 
			chars[i] = stack.pop();  // pop from stack and add in to char array
		}
		//return new String(chars);  //return char array as string
		return Arrays.toString(chars);
	}
	
	public static void reverse2(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				stack.push(s.charAt(i));
			}else {
				while(stack.isEmpty()==false) {
					System.out.println(stack.pop());
				}
			}
		}
		System.out.println(" ");
		while(stack.isEmpty()==false) {
			System.out.println(stack.pop());
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(reverse("abcd asd"));
		reverse2("hello world");
		

	}

	
}
