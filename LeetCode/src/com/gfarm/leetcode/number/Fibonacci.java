package com.gfarm.leetcode.number;

public class Fibonacci {

	// find nth number of fibonacci series using recursion
	public static int fibonacciRec(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacciRec(n - 1) + fibonacciRec(n - 2);
		}
	}

	public static void main(String[] args) {

		System.out.println(fibonacciRec(5));

	}

}
