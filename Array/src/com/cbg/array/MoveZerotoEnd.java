package com.cbg.array;

public class MoveZerotoEnd {

	public static void main(String[] args) {
		int arr[] = {1,0,4,0,12};
		moveZero(arr);

	}

	private static void moveZero(int[] arr) {
		int n = arr.length;
		int j =0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0)
				j++;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
