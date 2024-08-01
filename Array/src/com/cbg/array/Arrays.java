package com.cbg.array;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int numbers [] = new int [size];
		//take input
		for(int i=0; i<size;i++) {
			numbers[i] = sc.nextInt();
		}
		//output
		//take input
				for(int i=0; i<numbers.length;i++) {
					 System.out.println(numbers[i]+" ");
				}
		

	}

}
