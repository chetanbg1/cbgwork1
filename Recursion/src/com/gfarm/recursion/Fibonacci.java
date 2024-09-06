package com.gfarm.recursion;

public class Fibonacci {
	// result = 0,1,1,2,3,5,8,13,21...

	public static int fibonacci(int N) {
		int num1 = 0, num2 = 1;
		int num3 = 0;
		for (int i = 0; i < N; i++) {
			// Print the number
			System.out.print(num1 + " ");

			// Swap
			num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
		}
		System.out.println();
		return num1;
	}

	public static void fibonacci(int n1, int n2, int n) {
		if (n == 0) {
			return;
		}
		int n3 = n1 + n2;
		System.out.println(n3);
		fibonacci(n2, n3, n - 1);
	}

	public static int fib(int n) {
		// Base Case
		if (n <= 1)
			return n;

		// Recursive call
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n = 9;
		System.out.println(n1);
		System.out.println(n2);
		fibonacci(n1, n2, n - 2);

		System.out.println("---------------");
		System.out.println(fib(7));
		System.out.println("===========");
		System.out.println(fibonacci(7));

	}

}
