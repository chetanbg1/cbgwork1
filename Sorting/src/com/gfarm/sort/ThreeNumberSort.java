package com.gfarm.sort;

public class ThreeNumberSort {
	public static void print(int []arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
	}
	public static void threeNumberSort(int [] arr) {
		int i=0;
		int j =0;
		int k= arr.length-1;
		
		while(i<=k) {
			if(arr[i]==0) {
				swap(arr,i,j);
				i++;
				j++;
			}else if(arr[i] == 1) {
				i++;
			}else if(arr[i]==2){
				swap(arr, i,k);
				k--;
			}
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	public static void main(String[] args) {
		int [] arr = {2,0,2,2,0,1,1};
		print(arr);
		threeNumberSort(arr);
		print(arr);
	}

}
