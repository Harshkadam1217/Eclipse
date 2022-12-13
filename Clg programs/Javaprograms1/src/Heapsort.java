import java.util.*;
class Heapsort
{
	public void heapsort(int b[],int s,int m,int r,int l,int x,int temp)
	{
		while(s>=0)
		{
			temp=0;
			if(b[m]<b[l] && l<b.length)
			{
				m=l;
			}
			if(b[m]<b[r] && r<b.length)
			{
				m=r;
			}
			if(m>x)
			{
				temp=b[s];
				b[s]=b[m];
				b[m]=temp;
							
			}
			s--;
			m=s;
			x=s;
			r=(2*s)+2;
			l=(2*s)+1;
			heapsort(b,s,m,r,l,x,temp);
		}
		for(int j=0;j<b.length;j++)
			System.out.print(b[j]+" ");
	}
	public static void main(String args[])
	{
		Heapsort h=new Heapsort();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		int s=(int)(b.length-1/2)-1;
		int m=s;
		int x=s;
		int r=(2*s)+2;
		int l=(2*s)+1;
		int temp=0;
		h.heapsort(b,s,m,r,l,x,temp);
		sc.close();
	}
	

}