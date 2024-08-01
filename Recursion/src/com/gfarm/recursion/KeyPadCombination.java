package com.gfarm.recursion;

public class KeyPadCombination {
	
	public static String [] keyPad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static void printComb(String str, int idx, String combination) {
		if(idx ==str.length()) {
			System.out.println(combination);
			return;
		}
		char currentChar = str.charAt(idx);
		String mapping = keyPad[currentChar -'0'];
		
		for(int i=0; i<mapping.length();i++) {
			printComb(str, idx+1, combination+mapping.charAt(i));
		}
			
	}
	public static void main(String[] args) {
		String str ="23";
		printComb(str, 0, "");

	}

}
