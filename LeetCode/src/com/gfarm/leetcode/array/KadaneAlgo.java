package com.gfarm.leetcode.array;
// to find the max sum of subarray
public class KadaneAlgo {
	public static int maxSubArray(int [] arr) {
		int maxSofar= arr[0]; //consider first index element as max 
		int currentMax =arr[0]; // iterate from 1st index till end of array
		for(int i =1;i<arr.length;i++) {
			currentMax = currentMax +arr[i]; //add the next element in current
			if(currentMax < arr[i]) {   // if current is < next element starting a new array
				currentMax = arr[i]; // assign currentMax to next element
			}
			if(maxSofar < currentMax) { // check if max < than current 
				maxSofar = currentMax; // if true assign max = current
			}
		}
		return maxSofar; 
	}
	
	public static int maxsum(int [] arr) {
		int maxsum = arr[0];
		int currentsum = arr[0];
		for (int i=0;i<arr.length;i++) {
			
			currentsum = Math.max(arr[i], currentsum + arr[i]);
			maxsum = Math.max(maxsum, currentsum);
		}
		return maxsum;
	}
//time complexity O(n)- n - length of array
//space complexity O(1)
	
	public static int maxSubArray1(int [] arr) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int n : arr) {
			sum = Math.max(sum, 0) + n;
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		
		int []arr = {4,3,-2,6,-12,7,-1,6};
		System.out.println(maxSubArray(arr));
		System.out.println(maxSubArray1(arr));
		System.out.println(maxsum(arr));

	}

}
