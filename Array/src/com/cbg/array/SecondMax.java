package com.cbg.array;

import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		int[] arr = {12,34,78,2,54,88,34,88};
		
		System.out.println(secondMax(arr));
		secondMaxDuplicate(arr);

	}
	
	// take two pointers as max and secondmax both starts at index 0
	//traverse through the array
	// if index at i is greater than max 
	// assign max to second max 
	// and assign arr[i] to max 
	// else if max is not equal (or less than arr[i]) but arr[i] is greater than secondmax
	// assign arr[i] to secondmax
	private static int secondMax(int[] arr) {
		int max = arr[0];
		int secondmax = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax =max;
				arr[i]=max;
			}else if(arr[i]> secondmax && arr[i]!=max) {
				secondmax=arr[i];
			}
		}
		return secondmax;
	}
		//  array with no duplicates
//		Arrays.sort(arr); // array with no duplicates
//		 int result = arr[arr.length-2]; //second last element will be second max
//		 return result;	
//	}
	
	public static void secondMaxDuplicate(int [] arr) {
		Arrays.sort(arr);
		//array with duplicate elements
				for(int i = arr.length-2; i>=0;i--) {
					if(arr[i] != arr[arr.length-1]) {
						System.out.println(arr[i]);
						break;  //found
					}
					
				}
				
	}
}
