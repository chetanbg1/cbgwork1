package com.gfarm.leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;



// majority element 
public class MaxOccurence {

	public static int majorityElem(int [] arr) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i : arr) {
			map.put(i, map.getOrDefault(i,0)+1);	
		}
		int maxFreq=0;
		int result =-1;
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > maxFreq) {
				maxFreq = entry.getValue();
				result = entry.getKey();
			}
		}
		return result;
	}

	
	public static void main(String[] args) {
		
		int arr[] = {1,1,1,2,2,2,3,3,3,3};
		System.out.println(majorityElem(arr));

	}

}
