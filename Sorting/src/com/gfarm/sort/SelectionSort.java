package com.gfarm.sort;

public class SelectionSort {
	public static void print(int []arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
	}
	
	public static void selectionSort(int [] arr) {
		int n = arr.length;
		for(int i = 0; i<n-1;i++) {
			int min =i;
			for(int j = i+1;j<n;j++) {
				if(arr[j]< arr[min]) {
					min = j;  // find the smallest element
				}
			}
			//put the smallest at the beginning 
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		int arr [] = {5,1,9,2,10};
		print(arr);
		selectionSort(arr);
		print(arr);

	}

}
