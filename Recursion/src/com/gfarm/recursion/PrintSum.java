package com.gfarm.recursion;

public class PrintSum {
	// sum = (n(n+1))/2

	public static void printSum(int i, int n, int sum) {
		//int i ==level
		//int n == upper limit
		//int sum == final result
		if (i == n) {
			System.out.println(sum);
			return;
		}
		sum = sum + i;
		printSum(i + 1, n, sum);
	}

	public static void main(String[] args) {
		printSum(1, 10, 0);
	}

}
