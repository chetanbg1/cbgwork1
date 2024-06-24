package com.cbg.array;

public class MininArray {

	public static void main(String[] args) {
		int [] arr = {34,12,5,85,9,56};
		System.out.println(mininArrat(arr));
	}

	private static int mininArrat(int[] arr) {
		int min = arr[0];
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		return min;
	}

}
