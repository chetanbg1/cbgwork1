package com.gfarm.stream;

import java.util.Arrays;
import java.util.List;

public class OddEven {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 8, 3, 4, 6, 5);
		
		List<Integer> odd = list.stream().filter(a -> a%2!=0).toList();
		System.out.println(odd);
		
		List<Integer> even = list.stream().filter(a -> a%2==0).toList();
		System.out.println(even);

	}

}
