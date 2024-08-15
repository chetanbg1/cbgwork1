package com.gfarm.leetcode.string;

public class RotateString {

	public static void main(String[] args) {
		String originalString = "chetan";
		System.out.println(leftRotate(originalString , 2));
		System.out.println(rightRotate(originalString, 2));
	}

	private static String leftRotate(String originalString, int rotations) {
		
//		String leftrotated = null;
//		leftrotated = originalString.substring(rotations) + originalString.substring(0,rotations);
//		return leftrotated;
		return originalString.substring(rotations) + originalString.substring(0,rotations);
	}
	
private static String rightRotate(String originalString, int rotations) {
		
//		String righttrotated = null;
//		righttrotated = originalString.substring(originalString.length()-rotations) + originalString.substring(0,originalString.length()-rotations);
//		return righttrotated;
	return originalString.substring(originalString.length()-rotations) + originalString.substring(0,originalString.length()-rotations);
		
	}

}
