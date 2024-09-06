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
		String [] result = new String[num]; // create a result array to store result
		Queue<String> q = new LinkedList<>(); // create queue of strings
		q.offer("1");  // add 1
		for(int i=0;i< num;i++) {  //for loop till n 
			result[i] = q.poll();  //insert the queue.poll in result
			String n1 =result[i]+ "0"; //append the 0 in result generate new number
			String n2 =result[i]+ "1"; //append the 1 in result generate new number
			q.offer(n1);  // add in queue
			q.offer(n2);   //add in queue
		}
		return result;
	}

}
