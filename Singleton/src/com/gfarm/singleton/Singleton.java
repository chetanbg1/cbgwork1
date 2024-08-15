package com.gfarm.singleton;

import java.io.Serializable;

public class Singleton implements Serializable , Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static   Singleton instance ;
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(instance == null) {
			 instance = new Singleton();
		}
		return instance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
