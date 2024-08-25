package com.gfarm.leetcode.array;

//Q - given a sorted array of distinct integers and a target value. 
//return the index if the target is found 
//if not return the index where it would be if it were inserted in order 
public class SearchInsertPosition {

//thoughts before coding
	// we are trying to look for an element or insert position inside the sorted
	// array
	// if we are searching in sorted array most optimal approach is binary search
	// for each of the elements of index 'mid'
	// if nums[mid] == target - return index
	// if nums[mid] is less than target - search from 'mid+1' rightward
	// if nums[mid] is greater than target - search till 'mid -1' leftward
//pseudo code
	// create two variable left = 0 and right = nums.length-1
	// while the left is less than right find the mid
	// mid = left + (right - left) /2
	// if nums[mid] == target = return index/mid
	// else if nums[mid] < target - left = mid +1
	// else right = mid
	// if target does not exist in array
	// if nums[left] is less than target return left +1
	// else return left
//time complexity 
	// O(log n) , n -length of the input array
//space complexity 
	// O(1) - as we are not creating any extra data structure

	public static int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return (nums[left] < target? left+1:left);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
		System.out.println(searchInsert(arr, 2));

	}

}
