package com.dl.one;

public class RegisterImpl extends Register {
	
	public static void main(String[] args) {
		RegisterImpl r1=new RegisterImpl();
		r1.setFname("Harsh");
		r1.setLname("Kadam");
		r1.setAge(25);
		r1.setSalary(20000);
		
		System.out.print(r1.Fname);
		System.out.println(" "+r1.Lname);
		System.out.println(" ");
		System.out.println(r1.Age);
		System.out.println(r1.Salary);
	}

}
