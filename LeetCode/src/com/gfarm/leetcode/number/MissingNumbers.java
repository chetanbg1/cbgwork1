package com.gfarm.leetcode.number;

import java.util.HashSet;

public class MissingNumbers {

	public static void missingNumber(int []arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i :arr) {
			set.add(i);
		}
		for(int i=0;i<=arr.length-1;i++) {
			if(!set.contains(i)) {
			System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {0,1,2,5,7,9,8,4};
		missingNumber(arr);

	}

}
