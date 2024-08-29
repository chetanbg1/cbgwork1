package com.gfarm.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Q - given a sorted array of nums, remove duplicates and return array with new length
public class RemoveDuplicates {

//thought before coding
	//we can implement a two pinter approach  
	//one pointer 'i' will be used to populate unique numbers
	// other pointer 'j' will scan forward to find unique numbers
	//we should know that input array is sorted in ascending order
	// this means all the duplicated numbers are group together 
	// after we have accounted for the elements at nums[j]
	// we will want to skip all the future elements that is equal to nums[j]
	//after we have process all the numbers with pointer 'j' 
	//the value of 'i' will be the size of output array
//sudo code
	//create a variable 'i' to keep track of our current element  
	// iterate through the indices of the input list, denoted as 'j'
	// populate nums[j] at nums[i]
	// increment 'i' 
	// while 'j' is not the last index and the next number nums[j+1] is equal to the nums[j] ,
	// skip that number
	// increment 'j'
	//return 'i' the length of the new array without duplicates 
// time complexity O(n) - n = lenght of array
// space complexity is O(1) 
	
	public static int removeDuplicates(int [] arr) {
		int i = 0;
		for(int j = 0; j< arr.length;j++) {
			arr[i++] = arr[j];
			while(j!=arr.length-1 && arr[j]==arr[j+1]) {
				j++;
			}
		}
		return i;
	}
	
	public static void removeDuplicate(int [] arr) {
		//int n = removeDuplicates(arr);
		//int n = removeDuplicates3(arr);
		int n = removedup(arr);
		for(int i =0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int removeDuplicates1(int [] arr, int n) {
		 if (n <= 1)
	            return n;

	        // Use a Set to store unique elements
	        Set<Integer> uniqueElements = new HashSet<>();

	        // Traverse the array and add elements to the Set
	        for (int i = 0; i < n; ++i) {
	            uniqueElements.add(arr[i]);
	        }

	        int index = 0;
	        // Iterate through unique elements and update the original array
	        for (int element : uniqueElements) {
	            arr[index++] = element;
	        }

	        // Return the count of unique elements
	        return uniqueElements.size();
	    
	}
	
	public static int removeDuplicates3(int [] arr) {
		

	        // Use a Set to store unique elements
	        Set<Integer> uniqueElements = new HashSet<>();

	        // Traverse the array and add elements to the Set
	        for (int i = 0; i < arr.length; ++i) {
	            uniqueElements.add(arr[i]);
	        }

	        int index = 0;
	        // Iterate through unique elements and update the original array
	        for (int element : uniqueElements) {
	            arr[index++] = element;
	        }

	        // Return the count of unique elements
	        return uniqueElements.size();
	    
	}
	
	public static int removedup(int []arr) {
		Set<Integer> unielem = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			unielem.add(arr[i]);
		}
		int idx =0;
		for(int i : unielem) {
			arr[idx++] = i;
		}
		return unielem.size();
	}
	
	public static void main(String[] args) {
		int arr[] = {1,5,2,3,4,4,5,5,5};
		
		removeDuplicate(arr);
		
		
		 int n = arr.length;

	        // Remove duplicates and get the count of unique elements
	        n = removeDuplicates1(arr, n);

	        // Print the modified array containing unique elements
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
		System.out.println();
		System.out.println("-------------");
		System.out.println(removeDuplicates(arr));
		int m = removeDuplicates(arr);
		for (int i = 0; i < m; i++) {
          System.out.print(arr[i] + " ");
        }
	}

}
