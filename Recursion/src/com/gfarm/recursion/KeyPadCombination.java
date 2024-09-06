package com.gfarm.recursion;

public class KeyPadCombination {
	//create a string array same as key pad combination
	public static String [] keyPad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static void printComb(String str, int idx, String combination) {
		//base condition if index == string length 
		if(idx ==str.length()) {
			System.out.println(combination);
			return;
		}
		char currentChar = str.charAt(idx); //peek the current char
		String mapping = keyPad[currentChar -'0']; // map with keypad array which is 2nd index = "def" for now 
		
		for(int i=0; i<mapping.length();i++) { // def lenght =3 
			printComb(str, idx+1, combination+mapping.charAt(i));
		}
			
	}
	public static void main(String[] args) {
		String str ="23";
		printComb(str, 0, "");

	}

}
