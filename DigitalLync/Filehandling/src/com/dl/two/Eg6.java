package com.dl.two;

import java.io.Console;

public class Eg6 {

	public static void main(String[] args) {
		Console c=System.console();
		String username=c.readLine("Enter Username : ");
		char[] pwd=c.readPassword("Enter password : ");
		String pass=String.valueOf(pwd);
		if(username.equals("Harsh") && pass.equals("Kadam")) {
			System.out.println("Login succesfull");
		}
		else
			System.out.println("Login not succesfull");

	}

}
