package com.gfarm.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		
		String [] colours = {"red","green","blue"};
		
		List list = Arrays.asList(colours);
		System.out.println(list);
		
		List<String> list2 = new ArrayList<>();
//		Collections.addAll(list2, colours);
//		System.out.println(list2); 
		
		for(String s : colours) {
			list2.add(s);
		}
		System.out.println(list2);
		

	}

}
