package com.cbg.array;
//find the minnimum element from array
public class MininArray {

	public static void main(String[] args) {
		int [] arr = {34,12,5,85,9,56};
		System.out.println(mininArrat(arr));
	}
	
	//create variable  min
	//assign value at index 0 to min
	//traverse through the array 
	//compare if current index element is smaller than min 
	// if small then min == arr[1]
	//return min
	private static int mininArrat(int[] arr) {
		int min = arr[0];
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		return min;
	}

}
