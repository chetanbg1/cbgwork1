package com.gfarm.pattern;

public class Pattern13 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
