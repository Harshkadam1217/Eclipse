package com.dl.eight;
import java.util.*;

public class Dp2{
    public static void checksum(int a[][],int l[],int sum){

        for(int i=0;i<6;i++){
            for(int j=0;j<21;j++){
                if(l[i]==j){
                    a[i][j]=1;
                }
                else if(l[i]>j){                    
                    a[i][j]=a[i-1][j];
                   
                }
                else if(l[i]<j && i==0){
                    a[i][j]=0;
                }
                else if(l[i]<j){
                    a[i][j]=a[i-1][j-l[i]];
                }
                
            }
          
        }

        for(int i=0;i<6;i++){
            for(int j=0;j<21;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int f=0;
        for(int i=0;i<6;i++){
            if(a[i][sum]==1){
                f=1;
            }
        }
        if(f==1){
            System.out.println("true");

        }
        else{
            System.out.println("False");
        }

        
    }

    public static void main(String args[]){
        int a[][]= new int[6][21];
        int l[]=new int[6];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<6;i++)
        {
            l[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        Arrays.sort(l);
        checksum(a,l,sum);
        sc.close();
    }
}
