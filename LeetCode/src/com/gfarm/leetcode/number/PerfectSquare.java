package com.gfarm.leetcode.number;

public class PerfectSquare {

	public static void main(String[] args) {

		int num = 36;

		for (int i = 1; i < num/2; i++) {
			if (i * i == num) {
				System.out.println("num is a perfect square of " +i);
				return;
			}
		}

	}

}
