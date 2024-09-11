package com.gfarm.leetcode.string;

import java.util.Arrays;

public class FirstLetterOfEachWord {

	public static void main(String[] args) {
		
		String s= "aaa aas d df vvv nn";
		
		String strs [] =s.split("\\s");
		System.out.println(Arrays.toString(strs));
		
		for(String st : strs) {
			System.out.println(st.charAt(0));
		}

	}

}
