package com.dl.eight;
import java.util.Scanner;
public class Fibinoccione {
	
//	public static void fib2(int[] a,int i,int j) {
//		if((j+1)<=a.length) {
//			a[j+1]=a[j]+a[i];
//			j++;
//			i++;
//			System.out.print(a[j+1]+" ");
//		}
//		fib2(a,i,j);
//	}
	public static void fib(int f0,int f1,int c) {
		if(c!=0) {
			int f2=f0+f1;
			System.out.print(f2+" ");
			f0=f1;f1=f2;
			c--;
			fib(f0,f1,c);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
//		int a[]=new int[c+1];
//		a[0]=0;
//		a[1]=1;
//		int i=0,j=1;
//		System.out.print(a[i]+" ");
//		System.out.print(a[j]+" ");
//		fib2(a,i,j);
		int f0=0;
		int f1=1;
		System.out.println(" ");
		System.out.print(f0+" ");
		c--;
		System.out.print(f1+" ");
		c--;
		fib(f0,f1,c);
		sc.close();
	}
}
