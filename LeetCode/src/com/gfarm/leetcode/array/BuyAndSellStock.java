package com.gfarm.leetcode.array;
//Q - you are given a price of array prices where prices[i] is the price of a given stock on
// ith day
//you want to maximize the profit by choosing a single day to buy one stock and choosing 
//different day in future to sell that stock
//return the maximim profit you can achieve from this transaction, if you can not achieve profit 
//return zero
public class BuyAndSellStock {

//thought before coding
	//what is the max profit if sell at current index
	//we want to find the minimum price that is before index 'j' to generate a maximum profit
	//this means we have to keep the track of previous minimum value stock
	//then for each of the index j
	// for each of the index 'j'-
	//we can generate a highest profit using 'prices[j] - min'
//pseudo code
	//lets validate the input parameter
	//if prices is empty return zero
	//parameters - max profit , initially 0
	//			   min profit, initially 0
	//minprice - initially the first element prices[0]
	//iterate through the indices of prices from 1 to n of array denoted as 'i'
	//update 'maxprofit' if prices[i]-minprice is greater
	//update minprice if prices[i] is smaller
	//return maxProfit
//time complexity - O(n),where n is the length of input array, visit each index once
//space complexity -O(1)
	
	public static int maxProfit(int [] prices) {
		if(prices.length ==0) return 0;
		
		int minPrice = prices[0];
		int maxProfit = 0;
		
		for(int i=0; i< prices.length;i++) {
		maxProfit = Math.max(maxProfit, prices[i]-minPrice);
		minPrice = Math.min(minPrice, prices[i]);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int [] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}

}
