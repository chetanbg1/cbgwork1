package com.cbg.array;

public class MoveZerotoEnd {

	//create the variable j to compare next element with current element 
	// start j from 0
	// iterate through the array with index i
	// check if index i is not equal to zero and j equal to zero
	// if the condition is true swap the elements
	// second check if index j is not zero then increment the j
	private static void moveZero(int[] arr) {
		int n = arr.length;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0 && arr[j] == 0) { // if i !=0 and j==0 - swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) // j !=0 , j++
				j++;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void moveZero1(int[] arr, int[] newArr) {

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				newArr[j] = arr[i];
				j++;
			}
		}

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 4, 0, 12 };
		moveZero(arr);
		System.out.println();
		int [] newArr = new int[arr.length];
		moveZero1(arr,newArr );

	}

}
