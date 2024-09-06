package com.gfarm.leetcode.array;
//Q - given an array of non negative integers, find the container with maximum water
public class ContainerWithMaxWarter {
	
	public static int maxWater(int [] arr) {
		int left =0;
		int right =arr.length-1;
		int maxArea =0;
		
		while(left < right) {
			int area = Math.min(arr[left], arr[right]) * (right-left);
			
			maxArea = Math.max(maxArea, area);
			if(arr[left] < arr[right]) {
				left++;
			}else {
				right--;
			}
		}
		return maxArea;
	}
	public static void main(String[] args) {
		
		int arr[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxWater(arr));
	}

}
