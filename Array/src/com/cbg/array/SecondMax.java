package com.cbg.array;

public class SecondMax {

	public static void main(String[] args) {
		int[] arr = {12,34,78,2,54,88,34,88};
		
		System.out.println(secondMax(arr));

	}

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

}
