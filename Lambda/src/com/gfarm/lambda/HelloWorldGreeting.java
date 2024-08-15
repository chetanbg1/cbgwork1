package com.gfarm.lambda;

public class HelloWorldGreeting  implements Greeting{

	@Override
	public void perform() {
		System.out.println("hello word");
		
	}

}
