package com.gfarm.sort;



public class MergeSort {
	public static void print(int []arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
	}
	// 1st solution
	public static void mergeSort(int [] arr, int[] temp, int low, int high) {
		if(low < high) {
		int mid = low +(high -low)/2; //overflow condition
		mergeSort(arr,temp, low, mid);
		mergeSort(arr, temp, mid +1, high);
		merge(arr, temp, low, mid, high);
		}
	}
	private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
		for(int i=low; i<=high;i++){
			temp[i] = arr[i];
		}
		int i=low;     //left sorted subarray
		int j= mid +1;  //right sorted subarray
		int k = low;    //result array sorted 
		while(i <= mid && j <= high) {
			if(temp[i] <= temp[j]) {
				arr[k] = temp[i];
				i++;
			}else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		while(i <= mid) {
			arr[k] = temp[i];
			k++;
			i++;
		}
	}

	//2nd solution
	public static void divide(int arr[], int startIdx, int endIdx) {
		if(startIdx >= endIdx) {
			return;
		}
		int mid = startIdx +(endIdx -startIdx)/2;
		divide(arr, startIdx, mid);
		divide(arr, mid+1, endIdx);
		conquer(arr, startIdx, mid, endIdx);
	}
	private static void conquer(int[] arr, int startIdx, int mid, int endIdx) {
		int merged[] = new int[endIdx-startIdx +1];
		int idx1 =  startIdx;
		int idx2 = mid+1;
		int x=0;
		while(idx1<=mid && idx2<=endIdx) {
			if(arr[idx1]<=arr[idx2]) {
				merged[x++] = arr[idx1++];
			}else {
				merged[x++] =arr[idx2++];
			}
		}
		while(idx1<=mid) {
			merged[x++] = arr[idx1++];
		}
		while(idx2<=endIdx) {
			merged[x++] = arr[idx2++];
		}
		for(int i =0,j=startIdx;i<merged.length;i++,j++) {
			arr[j] = merged[i];
		}
	}
	public static void main(String[] args) {
		int arr [] = {5,1,9,2,10};
		print(arr);
		//mergeSort(arr, new int[arr.length], 0, arr.length-1);
		divide(arr, 0, arr.length-1);
		print(arr);

	}

}
