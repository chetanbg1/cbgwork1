package com.cbg.array;

import java.util.Arrays;

public class MIssingNumber {

	public static void main(String[] args) {
		int []arr = {2,4,1,8,6,3,7};
		int result =missingNumber(arr);
		System.out.println(result);
	}

	private static int missingNumber(int[] arr) {
//		int n = arr.length+1;
//		int sum = n*(n+1)/2;
//		for(int num : arr) {
//			sum = sum -num;
//		}
//		return sum;
		
		Arrays.sort(arr);
//		for(int i=1;i<=arr.length-1;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		for(int i=0;i<=arr.length-1;i++) {
			if(i != arr[i]-1) {
				return arr[i]-1;
			}
		}
		return 0;
	}

}