package com.cbg.array;

public class ReverseArray {

	public static void main(String[] args) {
		int [] arr = {2,11,5,10,7,8};
		
		 reverseArray(arr);
	
	}

	//use two pointer approach
	//index i will be starting index = 0
	// index  j last index of array , arr.length-1;
	//while i is less than j
	// swap the i and j 
	// increment i,i++ / decrement j, j--
	private static void reverseArray(int[] arr) {
		int i = 0;
		int j= arr.length-1;
		
		while(i<j) {
			int temp =arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(int k=0; k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
	}

}
