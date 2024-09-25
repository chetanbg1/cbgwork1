package com.gfarm.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllNUmbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,8,3,4,6,5);
		
		Optional<Integer> sum= list.stream().reduce((a,b) -> a+b);
		System.out.println(sum.get());
		
		
		int sum1 = (int) list.stream().mapToInt(a -> a).summaryStatistics().getSum();
		System.out.println(sum1);
		
		int sum2 = list.stream().mapToInt(a -> a).sum();
		System.out.println(sum2);
	}

}
