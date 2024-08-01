package com.cbg.array;

public class RemoveEven {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 7, 4, 9, 12, 8 };
	    int arr1[] = removeOdds(arr);
	    for(int i=0;i<arr1.length;i++) {
	    	System.out.print(arr1[i]+" ");
	    }

	}

	private static int[] removeEven(int[] arr) {
		int n = arr.length;
		int oddcount = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				oddcount++;
			}
		}

		int[] result = new int[oddcount];
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				result[idx] = arr[i];
				idx++;
			}
		}
		return result;
	}
	
	private static int[] removeOdds(int[] arr) {
		int n = arr.length;
		int evencount = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				evencount++;
			}
		}

		int[] result = new int[evencount];
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				result[idx] = arr[i];
				idx++;
			}
		}
		return result;
	}

}
