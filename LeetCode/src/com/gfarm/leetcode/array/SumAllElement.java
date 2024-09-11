package com.gfarm.leetcode.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumAllElement {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		System.out.println(IntStream.of(arr).sum());
		
		long sum1 = Arrays.stream(arr).summaryStatistics().getSum();
		System.out.println(sum1);
	}

}
