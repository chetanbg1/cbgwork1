package com.gfarm.sort;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	// create a result array having length n +m, addition of the length of arrays
	// use two pointer to traverse the two arrays, i and j
	// compare the elements at i and j add the small value in the result array
	// Increment the pointers
	public static int[] merge(int[] arr1, int[] arr2, int n, int m) {
		int[] result = new int[n + m];

		int i = 0; // traverse arr1
		int j = 0; // traverse arr2
		int k = 0; // traverse result

		while (i < n && j < m) { // boundary condition n=length of 1st array, m =length of 2nd array
			if (arr1[i] < arr2[j]) { // Compare the element add the smallest in result array
				result[k] = arr1[i]; // if element at i is less than element at j add in result array
				i++; // increment the pointer
			} else {
				result[k] = arr2[j];// if element at j is less than element at i add in result array
				j++; // increment the pointer
			}
			k++; // increment the result array pointer
		}
		// either arr1 got exhausted or arr2 got exhausted
		while (i < n) {
			result[k] = arr1[i]; // storing arr1 element into result
			i++;
			k++;
		}
		while (j < m) {
			result[k] = arr2[j]; // storing arr2 element into result
			j++;
			k++;
		}
		return result;
	}

	
	public static void main(String[] args) {
		int arr1[] = { 0, 1, 8, 10 };
		int arr2[] = { 2, 4, 11, 15, 20 };
		print(arr1);
		print(arr2);
		int[] result = merge(arr1, arr2, arr1.length, arr2.length);
		print(result);
		System.out.println(Arrays.toString(result));

	}

}
