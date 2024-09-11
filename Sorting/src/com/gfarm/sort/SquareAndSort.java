package com.gfarm.sort;

public class SquareAndSort {
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	public static int[] sortedSquare(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		int i = 0;
		int j = n - 1;
		for (int k = n - 1; k >= 0; k--) {
			if (Math.abs(arr[i]) > Math.abs(arr[j])) {
				result[k] = arr[i] * arr[i];
				i++;
			} else {
				result[k] = arr[j] * arr[j];
				j--;
			}
		}
		return result;
	}

	public static int[] sortedSquare2(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		int start = 0;
		int end = n - 1;
		int k = n - 1;
		while (start <= end) {
			if (arr[start] * arr[start] > arr[end] * arr[end]) {
				result[k--] = arr[start] * arr[start];
				start++;
			} else {
				result[k--] = arr[end] * arr[end];
				end--;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { -4, -1, 0, 3, 10 };
		print(arr);
		int[] result = sortedSquare(arr);
		print(result);

		int arr2[] = { -6, -1, 2, 4, 5 };
		print(arr2);
		int[] result1 = sortedSquare2(arr2);
		print(result1);

	}

}
