package com.gfarm.recursion;

public class XraiseTOn {
	// x^n = x*x*x*x*x..n times
	public static Long powerN(int x, int n) { //stack height = n
		if (n == 0) {
			return 1L;
		}
		if (x == 0) {
			return 0L;
		}
		return x * powerN(x, n - 1);
	}
	public static Long powerNlog2(int x, int n) { //stack height = log n
		if (n == 0) {
			return 1L;
		}
		if (x == 0) {
			return 0L;
		}
		if(n%2==0) {
			return  powerN(x, n / 2)*powerN(x, n / 2);
		}else {
			return powerN(x, n / 2)*powerN(x, n / 2) *x;
		}
	}
	public static void main(String[] args) {
		System.out.println(powerN(10, 10));
		
		System.out.println(powerNlog2(2, 5));

	}

}
