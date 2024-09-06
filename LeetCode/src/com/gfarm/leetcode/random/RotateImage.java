package com.gfarm.leetcode.random;

public class RotateImage {
	//matrix								//after rotate
	//  5	1	9	11						15	13	2	5	
	//	2	4	8	10						14	3	4	1
	//	13	3	6	7						12	6	8	7
	//	15	14	12	16						16	7	10	11
	public void rotate(int matrix [][]) {
		int n = matrix.length;
		for(int i=0;i<(n+1)/2;i++) { //keep the track of rings in matrix
			for(int j =0; j<n/2;j++) {  //keep track of each element the ring we choose
				//four way swap
				//temp = bottom left - which is 15
				int temp = matrix[n-1-j][i];
				//bottom left = bottom right
				matrix[n-1-j][i] = matrix[n-1-i][n-j-1];
				//bottom right = top right
				matrix[n-1-i][n-j-1]=matrix[j][n-1-i];
				//top right = top left
				matrix[j][n-1-i] = matrix[i][j];
				//top left = temp
				matrix[i][j] = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
