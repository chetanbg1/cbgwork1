package com.gfarm.leetcode.array;
// to find the max sum of subarray
public class KadaneAlgo {
	public static int maxSubArray(int [] arr) {
		int maxSofar= arr[0];
		int currentMax =arr[0];
		for(int i =1;i<arr.length;i++) {
			currentMax = currentMax +arr[i];
			if(currentMax < arr[i]) {   // starting a new array
				currentMax = arr[i];
			}
			if(maxSofar < currentMax) {
				maxSofar = currentMax;
			}
		}
		return maxSofar;
	}
	public static void main(String[] args) {
		
		int []arr = {4,3,-2,6,-12,7,-1,6};
		System.out.println(maxSubArray(arr));

	}

}
