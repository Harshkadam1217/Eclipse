package javaa.basics;

public class Operatorstwo {

	public static void main(String[] args) 
	{
		int a=12;
		int b=13;
		boolean c=(a++!=13|++b!=13);
		boolean d=(a++!=13||++b!=13);
		boolean e=(a++!=13 & ++b!=13);
		boolean f=(a!=13 && b<=13);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);//checks the true statements and puts it else false
		

	}

}
