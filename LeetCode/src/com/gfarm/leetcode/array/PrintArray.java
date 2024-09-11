package com.gfarm.leetcode.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7};
		String [] strs = {"one","two","three"};
		Arrays.asList(strs).forEach(elem -> System.out.println(elem));
		
		Arrays.stream(arr).forEach(System.out::println);
		
		Stream.of(arr).forEach(elem -> System.out.println(elem));
		
		System.out.println(Arrays.toString(arr));
		
		
		String result = Arrays.stream(strs).collect(Collectors.joining(","));
		System.out.println(result.toUpperCase());
	}

}
