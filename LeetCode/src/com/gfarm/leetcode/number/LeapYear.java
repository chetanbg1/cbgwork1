package com.gfarm.leetcode.number;

//year divisible by 400 
//OR
//divisible by 4 and not divisible by 100

public class LeapYear {

	public static void main(String[] args) {
		
		int year = 1800;
		
		if((year % 400 ==0) || ((year % 4==0) && (year % 100 !=0))) {
			System.out.println(year +" is leap year");
		}else
			System.out.println("not a leap year");
		

	}

}
