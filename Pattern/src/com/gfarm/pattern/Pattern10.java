package com.gfarm.pattern;

// solid rombus
public class Pattern10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
