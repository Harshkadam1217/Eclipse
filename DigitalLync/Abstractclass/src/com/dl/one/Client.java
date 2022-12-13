package com.dl.one;

public abstract class Client {

	{
		System.out.println("Instance Block");
	}
	
	static {
		System.out.println("Static Block");
	}

	
}
