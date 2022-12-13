
public class Doublelinkedlist 
{
	static int count;
	
	Node head;
	Node tail;
	public static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			prev=null;
			this.data=data;
			next=null;
		}
	}
	public static Doublelinkedlist InsertFirst(Doublelinkedlist dl,int data)
	{
		Node new_node=new Node(data);
		if(dl.head==null)
		{
			dl.head=new_node;
			dl.tail=new_node;
			
		}
		else
		{
			new_node.next=dl.head;
			dl.head=new_node;
			new_node.prev=null;
		}
		Node currnode=dl.head;
		while(currnode.next!=null)
		{
			currnode=currnode.next;
		}
		dl.tail=currnode;
		count++;
		return dl;
	}
	public static  Doublelinkedlist Insertlast(Doublelinkedlist dl,int data)
	{
		Node new_node=new Node(data);
		if(dl.head==null)
		{
			dl.head=new_node;
			dl.tail=new_node;
		}
		else
		{
			dl.tail=new_node;
			Node currnode=dl.head;
			while(currnode.next!=null)
			{
				currnode=currnode.next;
			}
			new_node.prev=currnode;
			currnode.next=new_node;
			new_node.next=null;
		}
		count++;
		return dl;
	}
	public static Doublelinkedlist  Deletefirst(Doublelinkedlist dl)
	{
		dl.head=dl.head.next;
		count--;
		return dl;
	}
	public static Doublelinkedlist Deletelast(Doublelinkedlist dl) throws Exception
	{
		dl.tail=dl.tail.prev;
		dl.tail.next=null;
		count--;
		return dl;
	}
	
	public static Doublelinkedlist Deleteatx(Doublelinkedlist dl,int x)
	{
		Node currentnode=dl.head.next;
		Node prevnode=dl.head;
		int i=1;
		while(i<x)
		{
			currentnode=currentnode.next;
			prevnode.next=currentnode;
			i++;
		}
		currentnode=currentnode.next;
		prevnode.next=currentnode;
		currentnode.prev=prevnode;
		count--;
		return dl;
		
	}
	public static Doublelinkedlist Insertatx(Doublelinkedlist dl,int data,int x)
	{
		Node currnode=dl.head.next;
		Node prevnode=dl.head;
		int i=1;
		Node new_node=new Node(data);
		if(x<=count)
		{
			while(i<(x-1))
			{
				currnode=currnode.next;
				
				i++;
			}
			
			
			new_node.prev=prevnode;
			new_node.next=currnode;	
			prevnode.next=new_node;
			currnode.prev=new_node;
			count++;	
			return dl;
		}
		else {
			System.out.println("No elements to add");
		}
		return dl;
	}	
	public static void printlist(Doublelinkedlist dl)
	{
		Node currentnode=dl.head;
		while(currentnode!=null)
		{
			
			System.out.print(currentnode.data+" ");
			currentnode=currentnode.next;
		}
	}
	
	public static void reverse(Doublelinkedlist dl)
	{
		Node currnode=dl.tail;
		while(currnode.prev!=null)
		{
			System.out.print(" "+currnode.data);
			currnode=currnode.prev;
		}
		System.out.print(" "+currnode.data);
		
	}
	public static void main(String[] args) throws Exception 
	{

		Doublelinkedlist dl=new Doublelinkedlist();
		dl=InsertFirst(dl,10);
		printlist(dl);
		System.out.println(" ");

		dl=Insertlast(dl,20);
		printlist(dl);
		System.out.println(" ");

		dl=InsertFirst(dl,30);
		printlist(dl);
		System.out.println(" ");
		
		dl=Insertatx(dl,40,2);
		printlist(dl);
		System.out.println(" ");
		
		reverse(dl);
		System.out.println(" ");
		
		dl=Deleteatx(dl,2);
		printlist(dl);
		System.out.println(" ");
		
		dl=Deletefirst(dl);
		printlist(dl);
		System.out.println(" ");
		
		dl=Deletelast(dl);
		printlist(dl);
		
		

	}

}
