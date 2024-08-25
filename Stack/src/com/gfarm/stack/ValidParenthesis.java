package com.gfarm.stack;

import java.util.Stack;

public class ValidParenthesis {

//thought before code
	//for each of the closing bracket we want to check the previous opening bracket
	//if there is matching brackets we will remove from consideration
	//this will allow the next closing bracket to compare with the previous bracket
//sudo code
	//create a stack to keep track of opening parenthesis
	//iterate through the indices of a string
	//retrieve the current character 'c' at each index
	// if the 'c' is the opening bracket add/push it to the stack
	//else if stack is empty or stack.pop()- (opening bracket) does not match the 'c' return false
	// return true if stack is empty
//time complexity
	//O(n) - n is length of string, visit each index once
//space complexity 
	//O(n) - because of the stack
	public static boolean isValid(String str) {
		Stack<Character> stack = new Stack<>(); //stack of characters
		for (char c : str.toCharArray()) { //iterate over string
			if (c == '(' || c == '{' || c == '[') { //push only opening brackets
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					char top = stack.peek(); //pick the top of stack
					if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
						stack.pop(); // if condition matches pop the char
					} else {
						return false;
					}

				}
			}
		}
		return stack.isEmpty(); // return true if the stack is empty 
	}

	public static void main(String[] args) {
		System.out.println(isValid("{()}"));

	}

}
