package com.gfarm.lambda;

public class MethodReference {
	
	public static void printMessage() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		//Thread t = new Thread(()-> printMessage()); //we are calling a method with no args/params
		Thread t = new Thread(MethodReference::printMessage);//method reference expression same as lambda expresstion
		t.start();

	}

}
