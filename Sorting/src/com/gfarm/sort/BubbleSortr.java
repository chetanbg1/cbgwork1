package com.gfarm.sort;

public class BubbleSortr {
	
	public static void print(int []arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
	}
	
	public static void bubbleSort(int [] arr) {
		boolean isSwapped;
		int n = arr.length;
		//bubble sort
		//iteration
		for(int i=0 ; i< n-1; i++) {
			isSwapped = false;
			//swapping
			for(int j =0; j< n-1-i;j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			if(isSwapped == false)
				break;
		}
		
	}
	public static void main(String[] args) {
		int arr [] = {12,23,1,4,77,45};
		print(arr);
		bubbleSort(arr);
		print(arr);

	}

}
