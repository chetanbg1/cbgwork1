package com.gfarm.leetcode.number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 11, 15 };
		int target = 13;
		int result[] = twoSum(arr, target);
		int result2[] = twoSumHashMap(arr, target);
		System.out.println(Arrays.toString(result2));
		int result3[] = twoSumHashMap1(arr, target);
		int result4[] = twoSum3(arr, target);
		for(int i : result4) {
		System.out.println(i+" ");
		}
	}
	//O(N^2)
	private static int[] twoSum(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}
	//main ans
	public static int[] twoSum1(int[]arr , int target) throws IllegalAccessException {
		int result[] = new int [2];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(target-arr[i])) {
				map.put(arr[i], i);
			}else {
				result[1]=i;
				result[0]= (int) map.get(target-arr[i]);
				return result;
			}
		}
		throw new IllegalAccessException("nai mila");
	}
	//O(n) - eliminates the nested for loop
	private static int[] twoSumHashMap(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {  //map the arr into map
		map.put(arr[i], i);  //key is - value at index i in arr , value is index i
							 // like {2,0}{7,1}{11,2}{15,3}
		}
		for(int i =0 ; i < arr.length;i++) {
			int secondNumber = target - arr[i];
			if(map.containsKey(secondNumber)&& map.get(secondNumber)!=i) { // if map contains the number it will give the values of that index
												// which is index of array
				return new int [] {i, map.get(secondNumber)};
			}
		}
		return null;
	}
	
	//O(n)
	private static int[] twoSumHashMap1(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0 ; i < arr.length;i++) {
			int secondNumber = target - arr[i];
			if(map.containsKey(secondNumber)&& map.get(secondNumber)!=i) { // if map contains the number it will give the values of that index
												// which is index of array
				return new int [] {map.get(secondNumber), i};
			}
			map.put(arr[i], i); 
		}
		return null;
	}
	
	//solution 3  sorting and two pointer
			public static int[] twoSum2(int[]arr , int target) {
				Arrays.sort(arr);
				int left =0;
				int right = arr.length-1;
				int result[] = new int [2];
				while(left < right) {
					int sum = arr[left]+arr[right];
					if(sum==target) {
						result[0] = arr[left];
						result[1] = arr[right];
						return result;
					}else if(sum<target) {
						left++;
					}else {
						right--;
					}
				}
				
				return new int[0];
			}
	
			//
			public static int[] twoSum3(int[]arr , int target) {
				Map<Integer, Integer> map = new HashMap<>();
				
				for(int i=0;i<arr.length;i++) {
					if(map.containsKey(target - arr[i])){
						return new int[] {i, map.get(arr[i])};
					}
					map.put(arr[i], i);
				}
				return new int[0];
			}
}
