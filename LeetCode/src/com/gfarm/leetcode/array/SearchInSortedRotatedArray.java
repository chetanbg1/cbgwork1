package com.gfarm.leetcode.array;

public class SearchInSortedRotatedArray {

	
	public static int modifiedBinarySearch(int [] arr , int target,int left, int right) {
		if(left > right) {
			return -1;
		}
		//avoid overflow, same as (left + right)/2
		int mid = left +((right-left)/2);
		if(arr[mid] == target) {
			return mid;
		}
		//if left half is sorted
		if(arr[mid] >= arr[left]) {
			//if key is in the left half
			if(arr[left] <= target && target <= arr[mid]) {
				return modifiedBinarySearch(arr, target, left, mid -1);	
			}else {
				return modifiedBinarySearch(arr, target, mid +1, right);
			}
		}else {
			//if right half is sorted
			if(arr[mid] <= target && target <= arr[right]) {
				return modifiedBinarySearch(arr, target, mid+1, right);	
			}else {
				return modifiedBinarySearch(arr, target,left, mid-1);
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {7,8,9,0,1,2,3,4,5,6};
		int left =0;
		int right = arr.length-1;
		
		System.out.println(modifiedBinarySearch(arr, 7, left, right));
	}

}
