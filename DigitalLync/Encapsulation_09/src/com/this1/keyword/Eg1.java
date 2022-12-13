package com.this1.keyword;
class CreateAccount{
	int userid;
	String fname;
	String lname;
	String email;
	long contactno;
	public CreateAccount(int userid, String fname, String lname, String email, long contactno) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contactno = contactno;
	}
	public void display() {
		System.out.println(userid);
		System.out.println(" ");
		System.out.print(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(contactno);
	}
	
}
public class Eg1 {
	
	public static void main(String[] args) {
		CreateAccount c=new CreateAccount(1217,"Harsh","Kadam","20891A1217Harshkadam@gmail.com",8309859792l);
		c.display();
	}
	

}
