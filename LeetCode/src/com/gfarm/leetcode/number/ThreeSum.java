package com.gfarm.leetcode.number;

import java.util.Arrays;

// print all such triplets such that they add up to a specific target,
//triplet should be in ascending order

//sort the array
// three pointers

public class ThreeSum {
	public static void threeSum(int[]arr, int target) {
		Arrays.sort(arr);  //sort the given array
		for(int i=0;i<arr.length-2;i++) { // traverse the array till send last index
			int j=i+1;  //  create variable j having plus 1 index of i 
			int k=arr.length-1;  // create variable k at last index of array
			while(j<k) {   //imp j is less than k 
				int sum =arr[i]+arr[j]+arr[k];  
				if(sum==target) {
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					j++;   //increment j;
					k--;   // decrement k;
				}else if(sum < target) {  // if sum less than target 
					j++;    // increment j
				}else {  // if sum is greater than target decrement k
					k--;
				}
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {2,4,3,7,1,0};
		threeSum(arr, 6);

	}

}
