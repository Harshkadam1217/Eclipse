package com.this1.keyword;

class Student{
	public Student() {
		this(10);
		System.out.println("Default Constructor");
	}
	
	public Student(int x)
	{
		this("Harsh","Kadam");
		System.out.println(x);
	}
	
	public Student(String fname,String lname) {
		System.out.println(fname+" "+lname);
	}
}
public class Eg3 {

	public static void main(String[] args) {
		new Student();

	}

}
