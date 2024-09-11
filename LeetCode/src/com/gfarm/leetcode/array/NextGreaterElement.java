package com.gfarm.leetcode.array;

public class NextGreaterElement {

	private static void printNextGreaterElement(int[] arr) {
		int next,i,j;
		for ( i = 0; i < arr.length; i++) {
			next =-1;
			for ( j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					next = arr[j];
					break;
				}
			}
			System.out.println(arr[i] + " " + next);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 11, 21, 13, 14 ,16};

		printNextGreaterElement(arr);

	}

}
