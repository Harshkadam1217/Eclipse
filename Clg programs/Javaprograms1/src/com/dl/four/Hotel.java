package com.dl.four;

import java.util.Scanner;

public class Hotel implements Normal, Acroom, Suite {

	@Override
	public void displayS(int r, int d) {
		int a = 0;
		if(d==1) {
			a=d*150;
			a*=r;
		}
		else if(d>1 && d<=5) {
			a=d*300;
			a*=r;
		}
		else {
			a=d*350;
			a*=r;
		}
		System.out.println("Cost is :"+a);

	}

	@Override
	public void displayA(int r, int d) {
		int a = 0;
		if(d==1) {
			a=d*550;
			a*=r;
		}
		else if(d>1 && d<=5) {
			a=d*500;
			a*=r;
		}
		else {
			a=d*450;
			a*=r;
		}
		System.out.println("Cost is :"+a);

	}

	@Override
	public void displayN(int r, int d) {
		int a = 0;
		if(d==1) {
			a=d*300;
			a*=r;
		}
		else if(d>1 && d<=5) {
			a=d*250;
			a*=r;
		}
		else {
			a=d*200;
			a*=r;
		}
		System.out.println("Cost is :"+a);

	}

	public static void main(String[] args) {
		Hotel h=new Hotel();
		String name;
		String address;
		long phoneno;
		int room;
		int days;
		int choice;
		try (Scanner sc = new Scanner(System.in)) {
			name=sc.nextLine();
			address=sc.nextLine();
			phoneno=sc.nextLong();
			room=sc.nextInt();
			days=sc.nextInt();
			choice=sc.nextInt();
		}
		switch(choice) {
		case 1:
			System.out.println("Name is : "+name);
			System.out.println("Address is : "+address);
			System.out.println("Contact no is : "+phoneno);
			System.out.println("No of rooms is : "+room);
			System.out.println("No of days is : "+days);
			h.displayN(room,days);break;
		case 2:
			System.out.println("Name is : "+name);
			System.out.println("Address is : "+address);
			System.out.println("Contact no is : "+phoneno);
			System.out.println("No of rooms is : "+room);
			System.out.println("No of days is : "+days);
			h.displayA(room, days);break;
		case 3:
			System.out.println("Name is : "+name);
			System.out.println("Address is : "+address);
			System.out.println("Contact no is : "+phoneno);
			System.out.println("No of rooms is : "+room);
			System.out.println("No of days is : "+days);
			h.displayS(room, days);break;
			
		}

	}

}
