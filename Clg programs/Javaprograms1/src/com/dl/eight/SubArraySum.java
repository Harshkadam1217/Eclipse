package com.dl.eight;
import java.util.*;
public class SubArraySum{
    public static void checksum(int a[][],int l[],int sum,int n){
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<sum+1;j++){
                if(l[x]==j){
                    a[i][j]=1;
                }
                else if(l[x]>j){                    
                    a[i][j]=a[i-1][j];
                   
                }
                else if(l[x]<j && i==0){
                    a[i][j]=0;
                }
                else if(l[x]<j){
                    a[i][j]=a[i-1][j-l[x]];
                }
                
            }
            x++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<sum+1;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i][sum/2]==1){
                c++;
            }
        }
        if(c>=2){
            System.out.println("true");

        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            l[i]=sc.nextInt();
            sum+=l[i];
        }
        int a[][]= new int[n][sum+1];
        Arrays.sort(l);
        checksum(a,l,sum,n);
        sc.close();
    }
}
