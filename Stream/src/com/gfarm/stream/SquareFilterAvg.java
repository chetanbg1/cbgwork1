package com.gfarm.stream;

import java.util.Arrays;
import java.util.List;

public class SquareFilterAvg {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 8, 3, 4, 6, 5);
		
		List<Integer> square=list.stream().map(a -> a*a).toList();
		System.out.println(square);
		
		List<Integer> squarefil=list.stream()
				.map(a -> a*a)
				.filter(a -> a>20)
				.toList();
		System.out.println(squarefil);
		
		double avg = list.stream()
				.map(a -> a*a)
				.filter(a -> a > 20)
				.mapToInt(a -> a)
				.average()
				.getAsDouble();
		System.out.println(avg);

	}

}
