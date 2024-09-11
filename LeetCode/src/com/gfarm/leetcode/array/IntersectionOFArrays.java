package com.gfarm.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOFArrays {
	
	public static void intersection(int[]arr1 , int [] arr2) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int i : arr1) {
			set.add(i);
		}
		for(int i : arr2) {
			if(set.contains(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr1 [] = {1,2,3,4};
		int arr2 [] = {4,5,1,8};
		intersection(arr1, arr2);
	}

}
