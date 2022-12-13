import java.util.*;
import java.lang.*;
class j4

{
	public void fib(int a,int f0,int f1,int f3)
	{
		if(a!=0)
		{
			f3=0;
			f3=f1+f0;
			System.out.println(f3);
			f0=f1;
			f1=f3;
			a--;
			fib(a,f0,f1,f3);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int f0=0;
		int f1=1,f3=0;
		j4 j=new j4();
		System.out.println(f0);
		System.out.println(f1);
		j.fib(a,f0,f1,f3);
	}
}