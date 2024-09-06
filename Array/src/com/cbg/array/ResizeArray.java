package com.cbg.array;

public class ResizeArray {
	
	
	public static void printArray(int []arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		int arr[] = {5,1,2,9,12};
		printArray(arr);
		
		int []result = resize(arr,10);
		printArray(result);
	}

	//to resize create new array  with given capacity 
	// add all elements of existing array in new array
	// return new array
	private static int[] resize(int[] arr, int capacity) {
		int [] temp = new int[capacity];
		
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		return temp;
	}

}
