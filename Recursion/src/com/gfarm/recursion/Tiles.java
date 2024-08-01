package com.gfarm.recursion;
//Place tiles of size 1*m in a floor of size n*m
public class Tiles {
	
	public static int placeTiles(int n, int m) {
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		//vertically place
		int verticalPlacements = placeTiles(n-m, m);
		//horizontally place
		int horizontalPlacements = placeTiles(n-1, m);
		
		return verticalPlacements +horizontalPlacements;
	} 
	public static void main(String[] args) {
		System.out.println(placeTiles(4, 2));

	}

}
