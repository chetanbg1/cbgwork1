package com.gfarm.leetcode.string;

public class LongestPalindromicSubString {

	public static String longestPlaindromSubstring(String str) {
		if (str.length() <= 1) {
			return str;
		}
		String LPS = "";

		for (int i = 1; i < str.length(); i++) {
			// consider a odd length
			int low = i;
			int high = i;
			// keep extending both left and right direction till condition of palindrome is
			// mate

			while (str.charAt(low) == str.charAt(high)) {
				low--;
				high++;

				// terminating the condition if we reach the end/start of string
				if (low == -1 || high == str.length()) {
					break;
				}
			}
			// indices low and high can be used to extract the substring
			String palindrom = str.substring(low + 1, high);
			// capture the longest palindrom found
			if (palindrom.length() > LPS.length()) {
				LPS = palindrom;
			}

			// consider the even length
			low = i - 1;
			high = i;
			while (str.charAt(low) == str.charAt(high)) {
				low--;
				high++;
				if (low == -1 || high == str.length()) {
					break;
				}
			}
			palindrom = str.substring(low + 1, high);
			// capture the longest palindrom found
			if (palindrom.length() > LPS.length()) {
				LPS = palindrom;
			}
		}
		return LPS;
	}

	public static void main(String[] args) {
		System.out.println(longestPlaindromSubstring("ebbabad"));

	}

}
