package com.gfarm.recursion;
//count total paths in a maze to move from (0,0)to (n,m), path right , downward only
//back tracking
public class Maza {
	
	public static int countPaths(int i, int j, int n, int m) {
		//base conditions
		if(i==n || j==m) {
			return 0;
		}
		if(i==n-1 && j==m-1) {
			return 1;
		}
		
		//move downward
		int downPaths = countPaths(i+1, j, n, m);
		//move right
		int rightPaths = countPaths(i, j+1, n, m);
		return downPaths +rightPaths;
	}
	public static void main(String[] args) {
		int n=3;
		int m=3;
		System.out.println(countPaths(0, 0, n, m));

	}

}
