package com.gfarm.leetcode.hashing;

import java.util.HashSet;

public class InterSectionOfArrays {
//find common elements from arrays
	private static int intersection(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		int count =0;
		for(int i : arr1) {
			set.add(i);
		}
		for(int i : arr2) {
			if(set.contains(i)) {
				System.out.print(i+" ");
				set.remove(i);
				count ++;
			}
		}
		System.out.println();
		return count;
		
	}
	
	public static void main(String[] args) {
		int arr1[] = { 7, 3, 9 };
		int arr2[] = { 6, 3, 9, 2, 9, 4 };
		
		System.out.println(intersection(arr1, arr2));

	}

	

}
