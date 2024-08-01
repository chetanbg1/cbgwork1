package com.gfarm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {

	public static void main(String[] args) {
		String[] result = genrateBinaryNumbrers(5);
		for(String s : result) {
			System.out.print(s + " ");
		}

	}

	private static String[] genrateBinaryNumbrers(int num) {
		String [] result = new String[num];
		Queue<String> q = new LinkedList<>();
		q.offer("1");
		for(int i=0;i< num;i++) {
			result[i] = q.poll();
			String n1 =result[i]+ "0";
			String n2 =result[i]+ "1";
			q.offer(n1);
			q.offer(n2);
		}
		return result;
	}

}
