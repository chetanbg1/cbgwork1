package com.gfarm.leetcode.array;

public class RotateArray {

	
	private static void leftRotate(int[] arr) {
		int temp =arr[0];
		
		for(int i=1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}
	
	private static void rightRotate(int[] arr) {
		int temp1 =arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp1;
		
		for(int i : arr) {
			System.out.print(i +" ");
		}
		
	}
	public static void main(String[] args) {
		
		int arr [] = {10,20,30,40,50};
//		leftRotate(arr);
//		System.out.println();
		rightRotate(arr);
	}

	

}
