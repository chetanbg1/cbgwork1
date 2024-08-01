package com.gfarm.sort;

public class MergeTwoSortedArray {
	public static void print(int []arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
	}
	
	public static int[] merge(int []arr1, int[] arr2, int n, int m) {
		int [] result = new int[n+m];
		
		int i=0; // traverse arr1
		int j=0; // traverse arr2
		int k=0; // traverse result
		
		while(i<n && j<m) { //boundary condition
			if(arr1[i] < arr2[j]) {
				result[k]  = arr1[i];
				i++;
			}else {
				result[k] = arr2[j];
				j++;
			}
			k++;
		}
		//either arr1 got exhausted or arr2 got exhausted
		while(i < n) {
			result[k] = arr1[i];  //storing arr1 element into result
			i++;
			k++;
		}
		while(j < m) {
			result[k] = arr2[j];  //storing arr2 element into result
			j++;
			k++;
		}
		return result;
	}
	public static void main(String[] args) {
		int arr1[] = {0,1,8,10};
		int arr2[] = {2,4,11,15,20};
		print(arr1);
		print(arr2);
		int []result = merge(arr1, arr2, arr1.length, arr2.length);
		print(result);

	}

}
