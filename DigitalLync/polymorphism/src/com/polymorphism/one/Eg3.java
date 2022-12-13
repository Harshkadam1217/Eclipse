package com.polymorphism.one;

public class Eg3 {

	public static void main(String[] args) 
	{
		int i1=10;
		int i2=20;
		System.out.println(i1+i2);
		String s1=""+i1;
		String s2=""+i2;
		System.out.println(s1+s2);
		String s3=""+10;
		String s4=""+10.0;
		System.out.println(s3+s4);
		String s5="Hello";
		String s6=""+40;
		System.out.println(s5+s6);
		double d1=10;
		String s7=""+d1;
		System.out.println(s7);
		System.out.println(" ");
		String s8=""+(int)d1;
		System.out.println(s8);
		System.out.println(" ");
		System.out.println(s7+s8);
	}

}
