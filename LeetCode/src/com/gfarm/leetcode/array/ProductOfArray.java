package com.gfarm.leetcode.array;

//return an array result[] such that result[i] is equal to the elements except arr[i]  in O(n)
//without using division operator
public class ProductOfArray {
	
	public static int[] findProduct(int arr[]) {
		int temp =1;  // create variable temp =1
		int []result = new int [arr.length];  // create new array of same length to store result
		for(int i =0 ;i<arr.length;i++) { // traverse through the array
			result[i]=temp;    // assign temp at current index of result array  
			temp = temp*arr[i]; // multiply the temp with current index 
		}
		temp=1;  // reassign temp to 1 
		for(int i =arr.length-1 ;i>=0;i--) {  //traverse array in reverse 
			result[i]=result[i]*temp; // multiply the current index of result array with temp
			temp = temp*arr[i];  // multiply current index with temp
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
