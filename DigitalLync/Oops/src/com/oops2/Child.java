package com.oops2;

class Parent
{
	public void m2()
	{
		System.out.println("Hello this is Child"); 
	}
	
}

public class Child extends Parent {
	public void m1() {
		System.out.println("Hello this is Parent");
	}
	public static void main(String args[])
	{
		Child c=new Child();
		c.m1();
		c.m2();
		
	}
	

}

