package com.gfarm.leetcode.number;
// number divisible by 1 or itself
public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 19;
		boolean flag = false;
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0) {
				flag = true;
			}
		}
		if(!flag) {
			System.out.println(num + " is prime number");
		}else
			System.err.println(num +" is not a prime number");

	}

}
