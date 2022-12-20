package com.dl.three;

import java.util.Scanner;

public class Advstaff extends Staff {
	int days;
	int hours;
	public Advstaff(String name,int id,int days,int hours) {
		super(name,id);
		this.days=days;
		this.hours=hours;
		
	}
	
	public void display() {
		
		super.display();
		System.out.println("Employee no of days : "+days);
		System.out.println("Employee no of hours : "+hours);
		System.out.println("Salary Earned is :"+(days*hours*150));
		System.out.println(" ");
	}

	public static void main(String[] args) {
		String b;
		int i;int d;
		int h;
		try (Scanner sc = new Scanner(System.in)) {
			b=sc.nextLine();
			i=sc.nextInt();
			d=sc.nextInt();
			h=sc.nextInt();
			new Advstaff(b,i,d,h).display();
			
			
		}
		
		
//		new Advstaff("Tilak",12345,30,8).display();
//		System.out.println(" ");
//		new Advstaff("Harsh",20891217,17,9).display();
		
	}

}
