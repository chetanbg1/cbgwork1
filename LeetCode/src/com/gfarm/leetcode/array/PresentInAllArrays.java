package com.gfarm.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PresentInAllArrays {

	public static void main(String[] args) {
		
		Integer [] arr1 = {1,2,3,9,8,7};
		Integer [] arr2 = {4,1,2,10,15};
		Integer [] arr3 = {5,1,2,4,10};
		
		HashSet<Integer> set = new HashSet<>();
		List<Integer> l1 = Arrays.asList(arr1);
		List<Integer> l2 = Arrays.asList(arr2);
		List<Integer> l3 = Arrays.asList(arr3);
		
		set.addAll(l1);
		set.addAll(l2);
		set.addAll(l3);
		
		System.out.println(set);
		
		List<Integer> finalList = new ArrayList<>();
		for(Integer num : set) {
			if(l1.contains(num) && l2.contains(num)
					|| l2.contains(num) && l3.contains(num)
					||l1.contains(num) && l3.contains(num)) {
				finalList.add(num);
			}
		}
		System.out.println(finalList);
		
	}

}
