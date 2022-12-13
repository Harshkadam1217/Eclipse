package com.this1.keyword;

class A{
	B b;//data member
	//constructor using field
	int x;
	String name;
	public A(B b,String name,int x){
		this.x=x;
		this.name=name;
	}
	public void getDetails() {
		System.out.println(x);
		System.out.println(name);
	}
	
}

class B{
	int x=1217;
	String name="Harsh";
	
	public B() {
		new A(this,name,x).getDetails();
	}
}

public class Eg5 {

	public static void main(String[] args) {
		new B();

	}

}
