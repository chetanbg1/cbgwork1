package com.gfarm.stream;

import java.util.Arrays;
import java.util.List;

public class SkipLimit {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 8, 3, 4, 6, 5);
		
		List<Integer> skip=list.stream().skip(3).toList();
		System.out.println(skip);
		
		List<Integer> limit=list.stream().skip(3).limit(1).toList();
		System.out.println(limit);
	
		List<Integer> limit1=list.stream().limit(5).toList();
		System.out.println(limit1);
	
		
		int sum=list.stream().limit(5).reduce((a,b)-> a+a).get();
		System.out.println(sum);
	}

}
