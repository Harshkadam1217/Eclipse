import java.util.*;
class j2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int c=0;
		
		for (int i=0;i<=a;i++)
		{
			if(a%i==0)
				System.out.println(i);
		}
		
	}
}