package com.gfarm.leetcode.array;

//Q - given an array of nums that is sorted in ascending order and a target value. find the indices
// of its first and last occurrence
public class FirstAndLastIndexInSortedArray {

	public static int[] searchRange(int[] nums, int target) {
		int left = findLeftBound(nums, target);
		int right = findRightBound(nums, target);

		return new int[] { left, right };
	}

	private static int findLeftBound(int[] nums, int target) {
		int index = -1;
		int low = 0;
		int high = nums.length - 1;

		// binary search
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				index = mid;
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return index;
	}

	private static int findRightBound(int[] nums, int target) {
		int index = -1;
		int low = 0;
		int high = nums.length - 1;

		// binary search
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				index = mid;
				low = mid + 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		int arr [] = {5,7,7,7,8,10};
		int target =7;
		
		for(int i: searchRange(arr, target)){
			System.out.print(i + " ");
		}
	}

}
