package com.gfarm.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 8, 3, 4, 6, 5);
		
		List<Integer> soretedAsc=list.stream().sorted().toList();
		System.out.println(soretedAsc);

		
		List<Integer> soreteddesc=list.stream().sorted(Collections.reverseOrder()).toList();
		System.out.println(soreteddesc);
	}

}
