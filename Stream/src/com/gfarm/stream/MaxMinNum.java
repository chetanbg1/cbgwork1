package com.gfarm.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinNum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 8, 3, 4, 6, 5);
		
		int min = list.stream().mapToInt(a -> a).min().getAsInt();
		System.out.println(min);
		
		int max = list.stream().mapToInt(a -> a).max().getAsInt();
		System.out.println(max);
		
		int min1=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min1);
		
		int max1=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max1);

	}

}
