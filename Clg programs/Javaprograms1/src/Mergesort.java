import java.util.*;
import java.util.ArrayList;
public class Mergesort 
{
	public void merge(int b[],int c[],ArrayList<Integer> d,int x,int y,int a)
	{
		if( (x<b.length) && (y<c.length))
		{
			if(b[x]<c[y])
			{
				d.add(b[x]);
				
				x++;
				
				merge(b,c,d,x,y,a);
				return;
				
			}
			else
			{
				d.add(c[y]);
				y++;
				
				merge(b,c,d,x,y,a);
				return;
			}
		}
		else if(x<b.length)
		{
			d.add(b[x]);
			x++;
			
			merge(b,c,d,x,y,a);
			return;
		}
		else if(y<c.length)
		{
			d.add(c[y]);
			y++;
			merge(b,c,d,x,y,a);
			return;	
		}
		
		
			
		for(int k=0;k<=d.size();k++)
		{
			System.out.println(d.get(k));
		}
		return;
	}

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();int b[]=new int[a];int c[]=new int[a];
			for(int i=0;i<a;i++)
			{
				System.out.println("Enter b elements");
				
				b[i]=sc.nextInt();
			}
			for(int j=0;j<a;j++)
			{
				System.out.println("Enter c elements");
				c[j]=sc.nextInt();
			}
			ArrayList<Integer> d=new ArrayList<Integer>();
			Mergesort m=new Mergesort();
			int x=0;int y=0;
			m.merge(b,c,d,x,y,a);
		}

	}

}
