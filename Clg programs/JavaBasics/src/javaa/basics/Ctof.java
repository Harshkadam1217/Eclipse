package javaa.basics;
import java.util.*;
import java.lang.*;
public class Ctof 
{
	public static void Ctof(float b)
	{
		double c;
		c=(float)(b*1.8)+32;
		double d1=c;
		System.out.println(c);
		
		c=(double)(b*1.8)+32;
		System.out.println(c);
		
		c=(int)(b*1.8)+32;
		System.out.println(c);
		
		c=(short)(b*1.8)+32;
		System.out.println(c);
		
		c=(long)(b*1.8)+32;
		System.out.println(c);
		
		System.out.println(" ");
		Integer i1=new Integer((int)d1);
		System.out.println(i1);
		Double i2=new Double(d1);
		System.out.println(i2);
		Float i3=new Float((float)d1);
		System.out.println(i3);
		Byte i4=new Byte((byte)d1);
		System.out.println(i4);
		Short i5=new Short((short)d1);
		System.out.println(i5);
		
	}
	
	public static void Ftoc(float b)
	{
		

		double d;
		d=(float)((b-32)*0.5556);
		double d2=d;
		System.out.println("Float" + d);
		
		d=(short)((b-32)*0.5556);
		System.out.println("Short" + d);
		
		d=(int)((b-32)*0.5556);
		System.out.println("Int" + d);
		
		d=(long)((b-32)*0.5556);
		System.out.println("Long" + d);
		
		d=(byte)((b-32)*0.5556);
		System.out.println("Byte" + d);
		
		System.out.println(" ");
		Integer i1=new Integer((int)d2);
		System.out.println(i1);
		Double i2=new Double(d2);
		System.out.println(i2);
		Float i3=new Float((float)d2);
		System.out.println(i3);
		Byte i4=new Byte((byte)d2);
		System.out.println(i4);
		Short i5=new Short((short)d2);
		System.out.println(i5);

		
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter your options to choose in which type you want to convert it into");
		System.out.println("Option 1 : Celsisus to Fahrenheit ");
		System.out.println("Option 2 : Fahrenheit to Celsius ");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		System.out.println("Enter the number you want to convert");
		float b=sc.nextInt();
		switch(a) 
		{
		case 1:
			Ctof(b);
			break;
		case 2:
			Ftoc(b);
			break;
		}
		

	}

}
