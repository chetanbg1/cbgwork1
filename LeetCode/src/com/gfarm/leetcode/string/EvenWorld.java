package com.gfarm.leetcode.string;

public class EvenWorld {

	public static void main(String[] args) {
		
		String str = "hello worl";
		
		for(String s : str.split(" ")) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}

	}

}
