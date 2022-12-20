package com.dl.seven;
import java.util.*;
public class Bfstwo {
    public static void main(String args[]) {
      try (Scanner sc = new Scanner(System.in)) {
		int a[][] = new int[10][10];
		  int q[]=new int[10];
		  int v[]=new int[10];
		  int s,c=0,first=0;
		  for(int i=0;i<10;i++){
		      v[i]=0;
		  }
		  for(int i=0;i<10;i++){
		      for(int j=0;j<10;j++){
		          a[i][j]=sc.nextInt();
		      }
		  }
		  for(int i=0;i<10;i++){
		      for(int j=0;j<10;j++){
		          System.out.print(a[i][j] + " ");
		      }
		      System.out.println();
		  }
		  s=0;
		  
		  v[s]=1;
		  c++;
		  int x=0;
		  q[x]=s;
		  while(c<=10 && first<10)
		  {
		      for(int i=0;i<10;i++)
		      {
		        if(a[s][i]==1 && v[i]==0)
		        {
		            q[x]=i;
		            x++;
		            v[i]++;
		            c++;
		            
		        }
		      }
		    System.out.print(s +" ");
		    s=q[first];
		    first++;
		  }
	}
    }
}