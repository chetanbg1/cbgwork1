package com.gfarm.leetcode.array;

public class SortNames {

	private static void sortNames(String[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (String s :arr) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		String[] arr = { "banana", "apple", "grapes" };
		
		 sortNames(arr);

	}

}
