package com.gfarm.leetcode.array;

public class NonRepeatingElementInArray {
	
	private static int singleNumber(int[] arr) {
		//variable to store XOR element
		int singleNo = arr[0];
		
		for(int i = 1; i < arr.length;i++) {
			
			//XOR the element with the previous
			singleNo = singleNo ^ arr[i];
		}
		return singleNo;
	}
	public static void main(String[] args) {
		
		int [] arr = {1,2,1,4,4,2,7};
		System.out.println(singleNumber(arr));

	}

	

}
