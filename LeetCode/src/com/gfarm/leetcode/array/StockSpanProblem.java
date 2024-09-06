package com.gfarm.leetcode.array;

import java.util.Stack;

//the span si of the stocks price on a given day i is defined as the maximum number of consecutive 
//days just before the given day, for which the price of the stock on the current day is less than or 
//equal to its price on the given day

public class StockSpanProblem {
	
	//brut force solution
	//start to traverse the array from end
	//for every value, look to the left until you find a value that is greater 
	//the span is the difference between two indexes
	//the span for the first element is always one
	public static int[] span(int []arr) {
		int result [] = new int[arr.length];
		int k = arr.length-1;
		for(int i = arr.length-1; i>=0;i--) {
			for(int j = i-1;j>=0;j--) {
				while(arr[j] > arr[i] && k>=0) {
					result[k] = i-j;
					k--;
				}
			}
		}
		result[0] = 1;
		return result;
	}
	
	public  static void calculateSpan(int price[], int n, int S[])
	    {
	        // Span value of first day is always 1
	        S[0] = 1;

	        // Calculate span value of remaining days by
	        // linearly checking previous days
	        for (int i = 1; i < n; i++) {
	            S[i] = 1; // Initialize span value

	            // Traverse left while the next element on left
	            // is smaller than price[i]
	            for (int j = i - 1;
	                 (j >= 0) && (price[i] >= price[j]); j--)
	                S[i]++;
	        }
	    }

	   

	//efficient solution
	//create a stack
	//add 1st element in stack, add 1 in result array as first element span is always 1
	//traverse the stack
	//span = current index - top of the stack
	//add into result array
	//if current value is higher than value at top index of stack, pop the stack
	
	public static int [] stackSpan(int [] arr) {
		int [] span = new int[arr.length];
		span[0] =1; //as span of first element is 1
		Stack<Integer> indexStack = new Stack<>();
		
		//push the index of first element
		indexStack.push(0);
		
		for(int i=1;i< arr.length;i++) {
			while(!indexStack.isEmpty() && arr[indexStack.peek()] <= arr[i]) {
				indexStack.pop();
			}
			//if index stack is empty, the price at index i
			//is greater than all previous values
			if(indexStack.isEmpty()) {
				span[i] = i+1;
			}else {
				span[i] = i - indexStack.peek();
			}
			indexStack.push(i);
		}
		
		return span;
	}
	public static void main(String[] args) {
		int [] arr = {100,80,60,70,60,75,85};
		
		//int result [] = stackSpan(arr);
		
		for(int i : stackSpan(arr)) {
			System.out.print(i+" ");
		}
		
		for(int j : span(arr)) {
			System.out.println(j + " ");
		}
		
		int result[] = new int[6];
		 calculateSpan(arr, 67, result);
		 for(int i : result) {
				System.out.print(i+" ");
			}
			
		 
		
	}

}
