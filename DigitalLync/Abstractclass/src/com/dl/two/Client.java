package com.dl.two;

public class Client {
	public static void main(String[] args) 
	{
		
		new B();
		System.out.println(" ");
		new Client();

	}
}
	abstract class A{
		public A(){
			System.out.println("Cons of class A");
		}
	}
	class B extends A{
		public B() {
			System.out.println("Cons of class B");
		}
	}

	


