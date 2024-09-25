package com.gfarm.stream;

import java.util.Arrays;
import java.util.List;

public class NumberStartsWith {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 22, 33, 544, 26, 85);

		List<Integer> startswith = list.stream()
				.map(e -> String.valueOf(e))
				.filter(e -> e.startsWith("2"))
				.map(Integer::valueOf).toList();
		System.out.println(startswith);
	}

}
