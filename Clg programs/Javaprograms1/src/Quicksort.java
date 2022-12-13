import java.util.*;

public class Quicksort 
{
	public void quicksort1(int b[],int i,int j,int k,int p,int temp)
	{
		k=j;
	
		j=b.length-1;
		
		temp=0;
		while(i<=k && k<=j)
		{
			temp=0;
			if(b[p]<b[j])
				j--;
			else if(b[p]>=b[i])
				i++;
			else if(b[p]>b[j] && b[p]<b[i])
			{
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
		i++;
		p=i;
		if(p<b.length)
		{
			temp=b[p];
			b[p]=b[j];
			b[j]=temp;
		}
		for(i=0;i<b.length;i++)
		{	
			System.out.print(b[i]+" ");
		}
		quicksort1(b,i,j,k,p,temp);
		
		
	}
	public void quicksort(int b[],int l[],int j,int i)
	{
		int p=0;
		int temp=0;
		while(i<=j)
		{
			temp=0;
			if(b[p]<b[j])
				j--;
			else if(b[p]>=b[i])
				i++;
			else if(b[p]>b[j] && b[p]<b[i])
			{
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
			
		}
		temp=b[p];
		b[p]=b[j];
		b[j]=temp;
		int k=j;
		i=0;j=b.length-1;
		quicksort1(b,i,j,k,p,temp);
		return;
	}

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			int a=sc.nextInt();
			int b[]=new int[a];
			for(int k=0;k<a;k++)
			{
				b[k]=sc.nextInt();
			}
			
			int j=b.length-1;
			int i=0;
			int l[]=new int[a];
			
			Quicksort q=new Quicksort();
			q.quicksort(b,l,j,i);
			
		}
	}

}


