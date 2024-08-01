package com.gfarm.sort;

public class InsertionSort {
	public static void print(int []arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
	}
	
	public static void insertionSort(int [] arr) {
		int n = arr.length;
		for(int i =1;i<n; i++){ //unsorted part
			int temp = arr [i];
			int j = i-1; // sorted part
			while(j>=0 && arr[j] > temp) {
				arr[j+1] = arr[j]; //shifting larger element to temp by 1 position
				j = j-1;
			}
			arr[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		int arr [] = {5,1,9,2,10};
		print(arr);
		insertionSort(arr);
		print(arr);

	}

}
