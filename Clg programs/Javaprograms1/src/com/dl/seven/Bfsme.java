package com.dl.seven;
import java.util.Scanner;
public class Bfsme {
	public static void main(String[] args) {
		int a[][]=new int[10][10];
		int s;
		int c=10;
		int rear=0,front=0;
		int q[]=new int[10];
		int v[]=new int[10];
		for(int i=0;i<10;i++) { 
			v[i]=0;
		}
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					a[i][j]=sc.nextInt();
				}
			}
		}
				s=0;
				
				q[rear]=s;
				v[s]=1;
				
				while(c>0 && front<10 ) {
					for(int j=0;j<10;j++) 
					{
						if(a[s][j]==1 && v[j]==0) {
							q[rear]=j;
							rear++;
							v[j]++;
							c--;
							
						}
//						for(int k=0;k<10;k++){
//							System.out.print(q[k]);
							
//						}
						
					}
					System.out.println(s+ " ");
					s=q[front];
					front++;
					
				}

			}
		
}

