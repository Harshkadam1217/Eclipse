import java.util.*;
class j2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int c=0;
		
		
		for (int i=2;i<=a;i++)
		{
			c=0;
			for(int j=2;j<=a;j++)
			{
				
				if(i%j==0)
				{	
					c++;
					
				}
				
			}
			if(c==1)
					System.out.println(i);
			
		
		}
		
	}
}