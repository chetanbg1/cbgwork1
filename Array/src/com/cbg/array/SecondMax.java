package com.cbg.array;

import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		int[] arr = {12,34,78,2,54,88,34,88};
		
		System.out.println(secondMax(arr));
		secondMaxDuplicate(arr);

	}

	private static int secondMax(int[] arr) {
//		int max = arr[0];
//		int secondmax = arr[0];
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				secondmax =max;
//				arr[i]=max;
//			}else if(arr[i]> secondmax && arr[i]!=max) {
//				secondmax=arr[i];
//			}
//		}
//		return secondmax;
//	}
		//  array with no duplicates
		Arrays.sort(arr); // array with no duplicates
		 int result = arr[arr.length-2];
		 return result;	
	}
	
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
