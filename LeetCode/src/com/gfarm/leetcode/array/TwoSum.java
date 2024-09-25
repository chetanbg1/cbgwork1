package com.gfarm.leetcode.array;
// given a array of integers, return indices of the two numbers such that they add up to
// a specific target

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	//solution 1   most fav
	public static int[] twoSum(int[]arr , int target) throws IllegalAccessException {
		int result[] = new int [2];
		Map map = new HashMap<>();
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
	
	
	//solution 2
	public static int[] twoSum1(int[]arr , int target) {
		int result[] = new int [2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(target == arr[i]+arr[j]) {
				
				result[1]=j;
				result[0]= i;
			}
		}
		}
		return result;
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
	public static void main(String[] args) throws IllegalAccessException {
		int arr[]  = {2,11,5,10,7,8};
		int[] result = twoSum(arr, 9);
		for(int i: result) {
			System.out.print(i+" ");
		}
	}

}
