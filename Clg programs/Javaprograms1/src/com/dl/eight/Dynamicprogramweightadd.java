package com.dl.eight;
import java.util.Scanner;
public class Dynamicprogramweightadd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of list");
		int n=sc.nextInt();
		int p[]=new int[n];
		int l[]=new int[n];
		
		System.out.print("enter list no");
		for(int i=0;i<n;i++)
			l[i]=sc.nextInt();
		
		
		System.out.print("enter profit for it");
		for(int i=0;i<n;i++)
			p[i]=sc.nextInt();
		
		System.out.println("Enter weight for it");
		int w=sc.nextInt();
		int dp[][]=new int[n+1][w+1];
		
		int h[]=new int[n];
		for(int i=0;i==0;i++)
			dp[i][w]=0;
		
		int i=1;
		int j=0;int k=0;
		
		
		sc.close();

	}

}
