package com.polymorphism.one;

public class Eg4 
{

	public Eg4(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public Eg4(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	public Eg4() {
		// TODO Auto-generated constructor stub
	}
	public void Eg4()
	{
		System.out.println("HEllo1");
	}
	public void Eg4(int x)
	{
		System.out.println(x);
	}
	public void Eg4(int x,int y)
	{
		System.out.println(x+" " + y);
	}
	public void Eg4(int x,int y,int z)
	{
		System.out.println(x+" "+y+" "+z);
	}
	
	
	

	public static void main(String[] args) {
		Eg4 e=new Eg4();
		e.Eg4();
		e.Eg4();
		e.Eg4(10);
		e.Eg4(10,20);
		e.Eg4(10,20,30);
		

	}

}
