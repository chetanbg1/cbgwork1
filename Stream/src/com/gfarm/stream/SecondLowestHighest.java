package com.gfarm.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 8, 3, 4, 6, 5);
		
		int secondHigh = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secondHigh);
		
		int secondlow = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secondlow);
	}

}
