package com.dl.six;

public class Child implements B, C {

	

	
	public void DisplayC() {
		// TODO Auto-generated method stub
		System.out.println("C method is called");

	}

	@Override
	public void DisplayB() {
		// TODO Auto-generated method stub
		System.out.println("B method is called");

	}
	
	public void DisplayA() {
		// TODO Auto-generated method stub
		System.out.println("A method is called");
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.DisplayA();
		c.DisplayB();
		c.DisplayC();
	}

}
