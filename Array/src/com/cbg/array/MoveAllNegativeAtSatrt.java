package com.cbg.array;

import java.util.Arrays;

public class MoveAllNegativeAtSatrt {

	
	private static void rearrange(int[] arr, int n, int[] newArr) {
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		//Arrays.sort(newArr);
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {-1,-20,30,40,50,-60,-5};
		int n =arr.length;
		int[] newArr = new int [arr.length];
		
		rearrange(arr,n,newArr);
	}

	
}
