package com.dl.eight;

import java.util.Scanner;

public class Treesum {
	
	public static void subarr(int[] a,int op,int i) {
		int op1=op;
		int op2=op;
		
		if(i==(a.length-1)) {
			System.out.println(op+" ");
			
		}
		else {  
			System.out.println("op1 before "+op1+"iteration "+i);
			for(int j=0;j<=i;j++) 
				op1+=a[j];
			System.out.println("Op1 after "+op1);
			System.out.println(" ");
			
			op2 = 0;
			System.out.println("op2 before "+op2+"iteration "+i);
			System.out.println("Op2 after "+op2);
			System.out.println(" ");
			++i;
			subarr(a,op1,i);
			subarr(a,op2,i);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int op = 0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int i=0;
		subarr(a,op,i);
		sc.close();

	}

}
