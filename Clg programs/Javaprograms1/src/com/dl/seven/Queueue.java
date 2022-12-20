package com.dl.seven;
import java.util.Scanner;
public class Queueue {
	static int rear=-1;
	static int front=-1;

	public int[] Enque(int a[],int d) {
		 if(rear-front==a.length){
	            System.out.println("Queue is full");
	        }
	        else if((rear+1)%a.length<=front && rear>=a.length-1 ){
	            a[(rear+1)%a.length]=d;
	            System.out.println("Pushed:"+a[(rear+1)%a.length]);
	            rear++;
	            
	        }
	        else{
	            a[rear+1]=d;
	            System.out.println("Pushed:"+a[rear+1]);
	            rear++;
	        }
		 return a;
	    }
	
	public void display(int a[]){
        System.out.print("QUEUE:");
        for(int i=front+1;i<=rear;i++){
            if(i>=a.length){
                System.out.print(a[(i)%a.length]+" ");
            }
            else{
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }

	
	public int[] dequeue(int a[]){
        if(front==rear){
            System.out.println("Queue is empty");
        }
        System.out.println("Popped:"+a[front+1]);
        front++;
        return a;
    }
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Queueue q=new Queueue();
			System.out.print("Enter the Size of queue :");
			int s=sc.nextInt();
			int a[]=new int[s];

			int choice;
			int d;
			while(true) {
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.print("Enter data :");
					d=sc.nextInt();
					a=q.Enque(a,d);
					break;
				case 2:a=q.dequeue(a);break;
				case 3:q.display(a);
				
				}
				if(choice==4) {
					System.out.println("Thank you");
					break;
				}
			}
			
		}
	}
}