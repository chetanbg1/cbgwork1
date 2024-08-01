package com.gfarm.leetcode.hashing;

import java.util.HashSet;

public class Unionof2Arrays {
// find the unique elements from arrays
	private static int sizeOfUnion(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : arr1) {
			set.add(i);
		}
		for (int i : arr2) {
			set.add(i);
		}
		System.out.println(set);
		return set.size();
	}

	public static void main(String[] args) {
		int arr1[] = { 7, 3, 9 };
		int arr2[] = { 6, 3, 9, 2, 9, 4 };

		System.out.println(sizeOfUnion(arr1, arr2));

	}

	

}
