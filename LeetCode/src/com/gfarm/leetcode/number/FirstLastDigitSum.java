package com.gfarm.leetcode.number;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		
		int num = 8134;
		int lastdigit = num % 10;
		
		int firstDigit = num;
		while(firstDigit > 10) {
			firstDigit = firstDigit/10;
		}
		
		int sum = firstDigit + lastdigit;
		System.out.println(sum);

	}

}
