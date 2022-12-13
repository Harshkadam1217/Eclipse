package com.dl.two;
class A{
	public A(A a) {
		System.out.println("Default constructor");
	}
	
	public A(int i) {
		new A(this);
		System.out.println("Constructor with a parameters");
	}
}

class B extends A{
	public B() {
		super(10);
//		new A(this);
		System.out.println("B constructor");
	}
	
}

public class Eg1 {

	public static void main(String[] args) {
		new B();
	}

}
