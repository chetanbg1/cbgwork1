package com.gfarm.sort;

public class QuickSort {
	public static void print(int []arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
	}
	public static void quickSort(int arr[],int low , int high) {
		if(low < high) {
			int p = partition(arr,low,high);  //p =pivot index
			quickSort(arr,low ,p-1);
			quickSort(arr,p+1,high);
		}
	}
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low;
		int j = low;
		while(i <= high) {
			if(arr[i]<=pivot) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
			i++;
		}
		return j-1;
	}
	public static void main(String[] args) {
		int arr [] = {5,1,9,2,10};
		print(arr);
		quickSort(arr, 0, arr.length-1);
		print(arr);

	}

}
