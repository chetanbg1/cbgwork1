package com.gfarm.recursion;

public class Factorial {
	// n! = n*(n-1)*(n-1)...*1
	
	public static int factorial(int n) {
		if(n==1 || n==0) {
			return 1;
		}
	 return n*factorial(n-1);
	}
	public static void main(String[] args) {
		
		System.out.println(factorial(5));

	}

}
