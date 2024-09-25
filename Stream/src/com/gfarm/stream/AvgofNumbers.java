package com.gfarm.stream;

import java.util.Arrays;
import java.util.List;

public class AvgofNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 8, 3, 4, 6, 5);

		

		int avg = (int) list.stream().mapToInt(a -> a).summaryStatistics().getAverage();
		System.out.println(avg);
		
		double avg1 = list.stream().mapToDouble(a -> a).average().getAsDouble();
		System.out.println(avg1);

	}

}
