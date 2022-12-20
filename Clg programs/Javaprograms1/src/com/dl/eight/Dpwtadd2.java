package com.dl.eight;

import java.util.Arrays;
import java.util.Scanner;

public class Dpwtadd2 {
	
	public void checksum(int[][] a1,int[]a ,int i,int j,int w,int n) {
		if((j+1)<n) {
			if((i+1)<(w+1)) {
				if(j==0) {
					if(i>j){
						a1[0][i]=0;
					}
					else
						a1[j][i]=1;
					
						++i;
						checksum(a1,a,i,j,w,n);
					
						
				}
				else if(i==j) {
					a1[j][i]=1;
				}
				else if(i<j) {
					a1[j][i]=1;
				}
				else if(i>j) {
					int a2;
					a2=a1[j][i]-a[j];
					if(a1[j-1][a2]==0 && (j-1)>=0) {
						a1[j][i]=0;
					}
					else if(a1[j-1][a2]!=0 && j>0)
						a1[j][i]=1;
				}
				
					++i;
					checksum(a1,a,i,j,w,n);
				
				
			}
			else {
				
				i=0;
				j++;checksum(a1,a,i,j,w,n);
				
			}
			
		}
		for(int i1=0;i1<n;i1++) {
			for(int j1=0;j1<w+1;j1++)
				System.out.println(a1[i1][j1]);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter weight of the profit");
		int w=sc.nextInt();
		
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Before ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println(" ");
		Arrays.sort(a);
		System.out.print("After ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println(" ");
		Dpwtadd2 d=new Dpwtadd2();
		int a1[][]=new int [n][w+1];
		int i=0;int j=0;
		d.checksum(a1,a,i,j,w,n);
		sc.close();
	}

}
