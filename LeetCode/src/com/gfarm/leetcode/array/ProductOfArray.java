package com.gfarm.leetcode.array;

//return an array result[] such that result[i] is equal to the elements except arr[i]  in O(n)
//without using division operator
public class ProductOfArray {
	
	public static int[] findProduct(int arr[]) {
		int temp =1;
		int []result = new int [arr.length];
		for(int i =0 ;i<arr.length;i++) {
			result[i]=temp;
			temp = temp*arr[i];
		}
		temp=1;
		for(int i =arr.length-1 ;i>=0;i--) {
			result[i]=result[i]*temp;
			temp = temp*arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4};
		int[]result = findProduct(arr);
		for(int i : result) {
			System.out.print(i+" ");
		}
	}

}
