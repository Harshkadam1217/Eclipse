import java.util.*;
import java.lang.*;
class j3
{
	public int prime(int y,int a)
	{
		int h;
		h=this.y;
		int z=1;
		z=z*h;
		return z;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		j3 x=new j3();
		int a=sc.nextInt();
		a=a-1;
		int c=0;
		int d=1;
		int e[]=new int[a];
		for(int i=2;i<=a;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(j%i==0)
					c++;
			}
			if(c==1)
			{
				h=x.prime(i,a);
			}
			if(h==a)
				System.out.print("EUCLID NUMBER");
			
		}
			
	}
}
	