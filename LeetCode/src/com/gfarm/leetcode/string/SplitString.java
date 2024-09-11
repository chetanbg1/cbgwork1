package com.gfarm.leetcode.string;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class SplitString {

	public static void main(String[] args) {
		String str = "091-123123123";

		
		//String strs[] = str.split("-");
		List<String> strs = Pattern.compile("-").splitAsStream(str).toList();
		for(String s : strs) {
			System.out.println(s);
		}
		StringTokenizer strt = new StringTokenizer(str, "-");
		while(strt.hasMoreTokens()) {
			String s = strt.nextToken();
			System.out.println(s);
		}
		
		
	}

}
