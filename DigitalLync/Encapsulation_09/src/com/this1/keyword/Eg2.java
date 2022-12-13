package com.this1.keyword;
class Parent{
	public void add() {
		System.out.println("Add method");
		
	}

	public void get() {
		System.out.println("Get method");
		
	}
	public void update() {
		this.add();
		System.out.println("Update method");
		this.get();
	}
}

public class Eg2 extends Parent {

	public static void main(String[] args) {
		new Parent().update();
		

	}

}
