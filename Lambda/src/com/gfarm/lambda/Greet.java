package com.gfarm.lambda;

public class Greet {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
	
		Greet greet = new Greet();
		
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting lambdaGreeting = ()-> System.out.println("hello word");
		
		
		//inner class
		//Anonymous inner class do not have the name 
		Greeting innerClassGreeting  = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("hello word");
				
			}
		};
		
		innerClassGreeting.perform();
		
		
		//to implement interface we need to create class
		helloWorldGreeting.perform(); //using class
		
		
		//implemented interface with function
		lambdaGreeting.perform();
		
		greet.greet(innerClassGreeting);
		greet.greet(lambdaGreeting);
		greet.greet(helloWorldGreeting);
	}

}
