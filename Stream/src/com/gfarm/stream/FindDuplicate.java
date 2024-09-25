package com.gfarm.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3,3,2,8,5,4, 3, 4, 6, 5);
		
		Set<Integer> set=list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
		System.out.println(set);
		
		Set<Integer> dupNum = new HashSet<>();
		Set<Integer> set1=list.stream().filter(a -> !dupNum.add(a)).collect(Collectors.toSet());
		System.out.println(set1);
	}

}
