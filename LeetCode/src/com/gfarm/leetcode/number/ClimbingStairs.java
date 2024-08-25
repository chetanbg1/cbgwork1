package com.gfarm.leetcode.number;

//Q - you are climbing a staircase. it takes n steps to reach the top
// each time you can either climb 1 or 2 steps, in how many different ways we can climb the steps 
public class ClimbingStairs {

//thoughts before coding
	// we are trying to find the number of different ways to reach the top 0 -> n
	// we should note that going from 0 -> n is same as going from n->0
	// we will implement a recursive approach that goes from n -> 0
	// in each of the recursive call we have two choices we can either take 1 step
	// or 2 steps
//pseudo code
	// implement the recursive approach
	// parameters - n, our current step
	// base case - n==0 or n ==1 return 1;
	// in each of the recursive call
	// recursively find the number of ways1 when we take step 1 n=> n-1
	// recursively find the number of ways2 when we take 2 steps n=> n-2
	// return way1 + way2
//time complexity - O(2^n), where n is input value
	// O(2^n), each recursive call has up to 2 choices and a depth of 'n'
//space complexity - O(n), where n is input value
	// O(n) - recursive call stack memory

	public static int climbStairs(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}
		return climbStairs(n - 1) + climbStairs(n - 2);

	}

//not a efficient solution
	// the recursive solution is very inefficient due to overlapping recursive calls
	// we can avoid the overlapping recursive calls using memorization
	// what do we need to cache ?
	// we are trying to find total number of distinct ways at the current value 'n'
	// this means we can cache 'n' with ways
//pseudo code
	// create an array 'memo' to cache previously calculated results
	// the indices represent 'n'
	// the values represent ways
	// implement the top-down memorization approach
	// parameters - n, our current step
	// memo, cache
	// base case - n==0 or n ==1 return 1;
	// if memo[n] is not equal to zero return memo[n]
	// in each of the recursive call
	// recursively find the number of ways1 when we take step 1 n=> n-1
	// recursively find the number of ways2 when we take 2 steps n=> n-2
	// put way1 + way2 at memo[n]
	// return memo[n]
//time complexity - O(n) - n is input value
//space complexity - O(n) + O(n) = O(n), memo array + recursive call stack memory

	public static int climbStairs1(int n , int[]memo) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if(memo[n]!=0) return memo[n];
		return memo[n]= climbStairs1(n - 1, memo) + climbStairs1(n - 2, memo);
	}

	public static int climbsStairs1(int n) {
		return climbStairs1(n, new int[n+1]);
	}
	
	
	public static int climbStairs2(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		int ways1=1;
		int ways2 =1;
		for(int i =0 ; i<=n;i++) {
			int ways = ways1 +ways2;
			ways2 = ways1;
			ways1 = ways;
		}
		return ways1;
	}
	public static int climbStairs3(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		int[] ways= new int[n+1];
		ways[0] =1;
		ways[1] = 1;
		
		for(int i =2 ; i<=n;i++) {
			ways[i] = ways[i-1]+ways[i-2];
		}
		return ways[n];
	}
	public static void main(String[] args) {

		System.out.println(climbStairs(3));
		System.out.println(climbStairs2(3));
		System.out.println(climbStairs3(3));
	}

}
