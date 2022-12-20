package com.dl.two;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Eg3 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Product ID");
			int a=sc.nextInt();
			System.out.println(a);
			System.out.print("Enter product name 2 : ");
//			String s2=sc.nextLine();
			int b=sc.nextInt();
			System.out.println(b);
			
//		System.out.println(" ");
		}
		catch(InputMismatchException e) {
			System.out.println(e);
			
		}
		
		
		
//		System.out.print("Enter Product Name : ");
//		String s=sc.next();
//		System.out.println(s);
//		System.out.println(" " );
//		System.out.println(" ");
		
		
	}

}
