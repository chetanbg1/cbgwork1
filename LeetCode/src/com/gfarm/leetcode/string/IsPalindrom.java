package com.gfarm.leetcode.string;

public class IsPalindrom {
//time complexity is O(n) n - length of string
//space complexity O(n) - converting to lower case
	private static boolean isPalindrom(String s) {
		int i = 0;
		int j = s.length() - 1;
		s.toLowerCase();
		while (i < j) {
			char c = s.charAt(i);
			char d = s.charAt(j);
			if(!isAlphanumberic(c)) {
				i++;
				continue;
			}
			if(!isAlphanumberic(d)) {
				j++;
				continue;
			}
			if (c == d) {
				return true;
			}
			i++;
			j--;
		}
		return false;
	}

	private static boolean isAlphanumberic(char d) {
		return Character.isLetter(d) || Character.isDigit(d);
}

	public static void main(String[] args) {
		String s = "A man, a plan, acanal: Panama";
		System.out.println(isPalindrom(s));

	}

}
