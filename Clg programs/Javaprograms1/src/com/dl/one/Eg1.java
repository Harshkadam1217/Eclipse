package com.dl.one;

class Parent{
	public Parent() {
		System.out.println("This is parent");
	}
}

class Child extends Parent{
	
}
public class Eg1 extends Child{

	public static void main(String[] args) {
		new Child();
	}

}
