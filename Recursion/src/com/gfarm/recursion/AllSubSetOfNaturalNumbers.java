package com.gfarm.recursion;
//print all the subset of a set of first n natural numbers
import java.util.ArrayList;

public class AllSubSetOfNaturalNumbers {
	
	public static void findSubset(int n, ArrayList<Integer> subset) {
		if(n==0) {
			printSubset(subset);
			return;
		}
		
		//want to be added
		subset.add(n);
		findSubset(n-1, subset);
		//not to be 
		subset.remove(subset.size()-1);
		findSubset(n-1, subset);
	}
	private static void printSubset(ArrayList<Integer> subset) {
		for(int n : subset) {
			System.out.print(n+" ");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> subset = new ArrayList<>();
		findSubset(4, subset);

	}

}
