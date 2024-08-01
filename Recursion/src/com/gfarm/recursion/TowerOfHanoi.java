package com.gfarm.recursion;

public class TowerOfHanoi {
	//rule 1- only one disk transfered in one step
	//smaller disks are always kept on top of larger disks
	public static void towerOfHanoi(int n,String src,String helper,String dest) {
		if(n==1) {
			System.out.println("transfer disk " + n+"from " +src+ "to "+dest);
			return;
		}
		towerOfHanoi(n-1, src, dest, helper);
		System.out.println("transfer disk " + n+"from " +src+ "to "+dest);
		towerOfHanoi(n-1, helper, src, dest);
	}
	public static void main(String[] args) {
		int n =3;
		towerOfHanoi(n, "s", "H", "D");

	}

}
