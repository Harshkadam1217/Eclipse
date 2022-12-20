package com.dl.five;

import java.util.Scanner;

public class Main implements AIML, BasicSalary, CSE, DS, ECE, IT {

	@Override
	public void displayI(int bonus) {
		// TODO Auto-generated method stub
		int a=0;
		a=basic+bonus;
		a=(int)(a-(a*penaltyI));
		System.out.println("Salary is : "+a);

	}

	@Override
	public void displayE(int bonus) {
		// TODO Auto-generated method stub
		int a=0;
		a=basic+bonus;
		a=(int)(a-(a*penaltyE));
		System.out.println("Salary is : "+a);

	}

	@Override
	public void displayD(int bonus) {
		// TODO Auto-generated method stub
		int a=0;
		a=basic+bonus;
		a=(int)(a-(a*penaltyD));
		System.out.println("Salary is : "+a);

	}

	@Override
	public void displayC(int bonus) {
		int a=0;
		a=basic+bonus;
		a=(int)(a-(a*penaltyC));
		System.out.println("Salary is : "+a);

	}
	
	
	@Override
	public void displayA(int bonus) {
		// TODO Auto-generated method stub
		int a=0;
		a=basic+bonus;
		a=(int)(a-(a*penaltyA));
		System.out.println("Salary is : "+a);

	}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Main m=new Main();
			int a=sc.nextInt();
			int choice=sc.nextInt();
			switch(choice){
			case 1:m.displayC(a);break;
			case 2:m.displayI(a);break;
			case 3:m.displayA(a);break;
			case 4:m.displayE(a);break;
			case 5:m.displayD(a);break;
			
				
			}
		}
		
	}

}
