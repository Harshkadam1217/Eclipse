package com.dl.seven;

import java.util.Scanner;

public class Stackone {
	static int i=99;
	public int[] push(int a[],int d) {
		if(i!=-1) {
			a[i]=d;
			--i;
		}
		else 
			System.out.print("Stack Overflow");
		return a;
	}
	
	public int[] display(int a[]) {
		for(int j=0;j<a.length;j++) {
			if(a[j]!=0) {
				System.out.println(a[j]+" ");
			}
		}
		return a;
	}
	
	public int[] pop(int a[]) {
		if(i==99) {
			System.out.println("Stack Underflow");
		}
		else {
			i++;
			a[i]=0;
		}
		return a;
	}
	
	
	
	

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Stackone s=new Stackone();
			int a[]=new int[100];
			int choice;
			int d;
			for(int i=0;i<a.length;i++) {
				a[i]=0;
			}
			while(true) {
				choice=sc.nextInt();
				switch(choice) {
				case 1:
						System.out.print("Enter digit");
						d=sc.nextInt();
						a=s.push(a,d);break;
				case 2: a=s.pop(a);break;
				case 3: s.display(a);
				case 4:break;
//				case 4:exit();break;
				}
				if(choice==4) {
					System.out.println("Thank you");
					break;
				}
			}
			
		}

	}

}
