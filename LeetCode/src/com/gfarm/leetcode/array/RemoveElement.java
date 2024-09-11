package com.gfarm.leetcode.array;

import java.util.Arrays;

public class RemoveElement {

	public static int[] removeElement(int [] arr, int element) {
		int newArr[] = new int [arr.length-1];
		
		int index =0;
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=element) {
				newArr[index] = arr[i];
				index++;
			}
		}
		return newArr;
	}
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		int element =3;
		System.out.println(Arrays.toString(arr));
		
		int [] result = removeElement(arr, element);
		for(int i : result) {
			System.out.println(i);
		}
		
	}

}
