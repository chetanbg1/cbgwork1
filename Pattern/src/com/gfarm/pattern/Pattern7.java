package com.gfarm.pattern;

public class Pattern7 {

	public static void main(String[] args) {
		int a = 1;
		for(int i=0; i<=4; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}

	}

}
