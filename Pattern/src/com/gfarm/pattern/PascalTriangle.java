package com.gfarm.pattern;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static List<List<Integer>> generate(int rows) {
		if (rows == 0)
			return new ArrayList<>();

		List<List<Integer>> result = new ArrayList<>();
		generate(rows, result);
		return result;

	}

	private static List<Integer> generate(int row, List<List<Integer>> result) {
		List<Integer> current = new ArrayList<>();
		current.add(1);
		if (row == 1) {
			result.add(current);
			return current;
		}
		List<Integer> prev = generate(row - 1, result);

		for (int i = 1; i < prev.size(); i++) {
			current.add(prev.get(i - 1) + prev.get(i));
		}

		current.add(1);

		result.add(current);

		return current;
	}

	
//Q - retrun a row index of pascal triangle
	
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int k = 0; k <= i; k++) {
				System.out.print(num + " ");
				num = num * (i - k) / (k + 1);
			}
			System.out.println();
		}

		System.out.println("================================");

		System.out.println(generate(5));
	}

}
