package com.dl.three;

public class Staff extends Parent {
	int id;
	public Staff(String name,int id) {
		super(name);
		this.id=id;
		
		
	}
	
	public void display() {
		super.display();
		System.out.println("Employee id is : "+id);
	}

}
