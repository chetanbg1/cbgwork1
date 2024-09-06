package com.cbg.array;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // taking the input from user
		int size = sc.nextInt(); // integer value

		int numbers[] = new int[size]; // declaration of array
		// take input from user
		for (int i = 0; i < size; i++) { //
			System.out.println("inter the number at index : " + i );
			numbers[i] = sc.nextInt();
		}
		// output print the array

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
