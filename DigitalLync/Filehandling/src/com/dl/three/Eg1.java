package com.dl.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg1 {

	public static void main(String[] args) throws IOException {
//		try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
//			System.out.println("Enter a product no : " );
//			String a=r.readLine();
//			int parseInt=Integer.parseInt(a);
//			System.out.println(parseInt);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		System.out.println("Enter name");
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String r1=r.readLine();
		System.out.println(r1);
		System.out.print("Enter an Integer : ");
		int i=Integer.parseInt(r.readLine());
		System.out.println(i);
		
		System.out.println("Enter your name");
		int r2=r.read();
		float r3=r2;
		System.out.println(r2+" "+(char)r2);
		System.out.println(r3);

	}

}
