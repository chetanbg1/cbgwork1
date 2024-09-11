package com.gfarm.leetcode.array;

import java.util.Arrays;

//{10,20,30,40,50,60}  = (30+40) /2 = 35 is median
public class MedianofArray {

	
	public static double median(int [] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		
		if(n%2==1) {
			return arr[n/2];
		}else {
			return (arr[n-1]/2 + arr[n/2])/2.0;
		}
	}
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60};
		System.out.println(median(arr));

	}

}
