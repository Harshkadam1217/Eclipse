package com.oops;

class Parent{
	public void m1()
	{
		System.out.println("HEllo this is parent class");
	}
}

public class Eg1 extends Parent

{
	public void m2() {
		System.out.println("Hello this is child class");
		
	}
	

	public static void main(String[] args) {
		Eg1 e=new Eg1();
		e.m2();
		e.m1();
		Parent p=new Parent();
		p.m1();
		

	}

}
