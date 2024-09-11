package com.gfarm.leetcode.string;

public class CompareStrings {

	public static void main(String[] args) {
		
		String str1 = "abed";
		String str2 = "abcd";
		boolean iscompared = false;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!= str2.charAt(i)) {
				iscompared=false;
				break;
			}else
				iscompared = true;
		}
		System.out.println(iscompared);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));

	}

}
