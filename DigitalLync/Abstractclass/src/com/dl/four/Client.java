package com.dl.four;
public class A{
	private static  int a=10;

	public void m1() {
		System.out.println("Number is : "+ a);
	}
}

public abstract class Client {
	

	public static void main(String[] args) {
		new Client().m1();
	}

}
