package com.gfarm.leetcode.number;

public class AddBinary {

//thought before coding
	//we need two bits from right to left
	//we can implement two pointer approach
	//'i' will indicate our current location inside a
	//'j' will indicate our current location inside b
	//in each iteration we will be finding the sum of the bits located at these two pointers
	//while adding the bits there might be a carry over, we have to keep that in account
	//possibilities
	// b1	b2	  carry		sum
	// 1	1		1		3	bit =1 carry =1
	// 1	1		0		2	bit =0 carry =1
	// 1	0		1		2	bit =0 carry =1
	// 1	0		0		1	bit =1 carry =0
	// 0	1		1		2	bit =0 carry =1
	// 0	1		0		1	bit =1 carry =0
	// 0	0		1		1	bit =1 carry =0
	// 0	0		0		0	bit =0 carry =0
	//one of the side case is two input bits may not be the same length
	//this means one of the bit can go out of bound
	//when a pointer is out of bound we will default the value of bit to 0
	
//pseudo code
	//i, our current index inside a, initially at the last index
	//j, our current index inside b, initially at the last index
	//carry , current carry
	// result, StringBuilder to keep track of our result
	// while i or j is not out of bound (greater than or equal to zero)
	//retrieve the current b1 from index i inside a if it is out of bound we will take it as 0
	//decrement i
	//retrieve the current b2 from index j inside b if it is out of bound we will take it as 0
	//decrement j
	// calculate sum =b1 +b2 + carry
	//if sum is equal to 3 or 2 then the carry will be 1 else set carry to 0
	//if the sum is equal to 1 or 3 then append 1 to our result else append 0 to result
	// if carry is greater than 0 append 1 to result
	//reverse the result and return string representation
//time complexity - O(n) length of the longer bit, process all the bits
//space complexity - O(n) StringBuilder and result string O(2*n)
	
	public static String addBinary(String a, String b) {
		int i = a.length()-1; //start from last index
		int j = b.length()-1;  //start from last index
		int carry =0;   //initially carry is zero
		
		StringBuilder result = new StringBuilder();  // create stringbuilder to store result
		while(i >=0 || j >=0 ) {
			int b1 = (i>=0) ? Character.getNumericValue(a.charAt(i--)) : 0; //
			int b2 = (j>=0) ? Character.getNumericValue(b.charAt(j--)) : 0;
			int sum = b1 + b2 + carry;
			carry =(sum ==3 || sum == 2) ? 1 :0; 
			result.append((sum==1 || sum ==3)? 1 : 0);
		}
		if(carry > 0) result.append(1);
		
		return result.reverse().toString();
	}
	
	
	public static void main(String[] args) {
		String a = "111";
		String b = "100";
		
		System.out.println(addBinary(a, b));

	}

}
