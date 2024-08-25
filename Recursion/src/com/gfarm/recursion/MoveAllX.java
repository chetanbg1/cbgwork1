package com.gfarm.recursion;

public class MoveAllX {
	
	public static void moveAllX(String str, int idx,int count, String newStr) {
		if(idx ==str.length()) { //if index == string.length
			for(int i=0;i<count;i++) { // newStr is not going to be the same length of original string as we have removed 'x'
				//append the x to new string count number of times
				newStr += 'x';
			}
			System.out.println(newStr);  // print new string
			return;
		}
		char currentChar = str.charAt(idx);
		if(currentChar == 'x') {
			count++; // increase the count
			moveAllX(str, idx+1, count, newStr); // check next index
		}else {
			newStr += currentChar; //if not x add that char to newstring
			moveAllX(str, idx+1, count, newStr); //increase index and return to base condition
		}
	}
	public static void main(String[] args) {
		String str = "axbcxxd";
		String newString = "";
		moveAllX(str, 0, 0, newString);

	}

}
