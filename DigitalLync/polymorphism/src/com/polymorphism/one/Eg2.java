package com.polymorphism.one;

public class Eg2 {

	public static void main(String[] args) 
	{
		Eg2 e=new Eg2();
		e.getDetails(1203, "Ashwin", "AVSR", 9248049012L);
		System.out.println(" ");
		e.getDetails(1220, "Jayanth", "Pawar", "Saroornagar");

	}
	
	
	public void getDetails(int Userid,String fname,String lname,long usercontact)
	{
		System.out.println("Userid "+Userid );
		System.out.println("Fname "+fname);
		System.out.println("Lname "+lname);
		System.out.println("Contact number "+usercontact);
		
	}
	
	
	public void getDetails(int Userid,String fname,String lname,String Address)
	{
		System.out.println("Userid "+Userid );
		System.out.println("Fname "+fname);
		System.out.println("Lname "+lname);
		System.out.println("Address "+Address);
	}

}
