package com.gfarm.leetcode.string;
//check whether string contains all the English alphabets or not 
public class Panagram {

	
	private static boolean isPanagram(String s) {
		if(s.length() < 26) {
			return false;
		}else {
			for(char ch ='a' ; ch<='z';ch++) {
				if(s.indexOf(ch)<0) {
					return false;
				}
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		String s ="the quick brown fox jumps over the lazy dog";
		
		System.out.println(isPanagram(s.toLowerCase()));

	}

	
}
