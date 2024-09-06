package com.cbg.array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows = sc.nextInt();
		
		System.out.println("enter the number of cols");
		int cols = sc.nextInt();
		
		int [][] numbers = new int [rows][cols];//2d array declaration 
		
		System.out.println("enter the elements");
		//input
		//rows
		for(int i=0;i<rows;i++) {
			//columns
			for(int j=0;j<cols;j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		
		//output
		for(int i=0;i<rows;i++) {
			//columns
			for(int j=0;j<cols;j++) {
			System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
