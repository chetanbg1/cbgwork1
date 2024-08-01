package com.gfarm.recursion;
//find the number of ways in which you can invite n people to your party , single or in pairs
public class PartyInvite {
	
	public static int callGuest(int n) {
		if(n<=1) {
			return 1;
		}
		
		//single 
		int way1= callGuest(n-1);
		//pairs
		int way2 = (n-1)*callGuest(n-2);
		return way1+way2;
	}
	public static void main(String[] args) {
		System.out.println(callGuest(4));

	}

}
