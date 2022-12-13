public class Circularlist 
{
	static int count;
	Node tail;
	public static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static Circularlist InsertFirst(Circularlist dl,int data)
	{
		Node new_node=new Node(data);
		if(dl.tail==null)
		{
			dl.tail=new_node;
			new_node.next=new_node;
		}
		
		else
		{
			new_node.next=dl.tail.next;
			dl.tail.next=new_node;
		}
		count++;
		return dl;
	}
	
	
	
	public static  Circularlist Insertlast(Circularlist dl,int data)
	{
		Node new_node=new Node(data);
		if(dl.tail==null)
		{
			dl.tail=new_node;
			new_node.next=new_node;
		}
		else
		{
			new_node.next=dl.tail.next;
			dl.tail.next=new_node;
			dl.tail=new_node;
		}
		count++;
		return dl;
	}
	
	
	
	
	
	public static Circularlist  Deletefirst(Circularlist dl)
	{
		Node currnode=dl.tail.next;
		dl.tail.next=currnode.next;
		count--;
		return dl;
	}
	public static Circularlist Deletelast(Circularlist dl) throws Exception
	{
		int i=1;
		Node currentnode=dl.tail.next;
		Node prevnode=dl.tail;
		while(i<count)
		{
			prevnode=prevnode.next;
			currentnode=currentnode.next;
			i++;
		}
		prevnode.next=dl.tail.next;
		
		dl.tail=prevnode;
		currentnode.next=null;
		count--;
		return dl;
	}
	public static Circularlist Insertatx(Circularlist dl,int data,int x)
	{
		Node new_node=new Node(data);
		Node currnode=dl.tail.next;
		Node prevnode=dl.tail;
		for(int i=1;i<x;i++)
		{
			prevnode=currnode;
			currnode=currnode.next;
		}
		new_node.next=currnode;
		prevnode.next=new_node;
		count++;
		return dl;
	}	
	public static Circularlist Deleteatx(Circularlist dl,int x)
	{
		Node currnode=dl.tail.next.next;
		Node prev=dl.tail;
		int i=1;
		while(i<x)
		{
			prev=prev.next;
			currnode=currnode.next;
			i++;
		}
		prev.next=currnode;
		count--;
		return dl;
	}
	public static void printlist(Circularlist dl)
	{
		Node currentnode1=dl.tail.next;
		int i=1;
		while(i<=count)
		{
			
			System.out.print(" " + currentnode1.data);
			currentnode1=currentnode1.next;
			i++;
		}
	}
	
//	public static void Reverselist(Circularlist dl)
//	{
//		Node currentnode1=dl.tail.next;
//		int i=1;
//		for(i=1;i<count;i++)
//		{
//			int j=1;
//			while(j<(count-i))
//			{
//				System.out.print(" "+ currentnode1);
//				currentnode1=currentnode1.next;
//				j++;
//			}
//		}
//	}

	public static void main(String[] args) throws Exception 
	{
		Circularlist dl=new Circularlist();
		dl=InsertFirst(dl,10);
		printlist(dl);
		System.out.println(" ");
		
		dl=Insertlast(dl,20);
		printlist(dl);
		System.out.println(" ");
		
		dl=Insertlast(dl,50);
		printlist(dl);
		System.out.println(" ");
		
		dl=InsertFirst(dl,30);
		printlist(dl);
		System.out.println(" ");
		
		dl=InsertFirst(dl,40);
		printlist(dl);
		System.out.println(" ");
		
//		Reverselist(dl);
		System.out.println(" ");
		
		dl=Deletefirst(dl);
		printlist(dl);
		System.out.println(" ");
		
		dl=Deletelast(dl);
		printlist(dl);
		System.out.println(" ");

		dl=Insertatx(dl,60,2);
		
		printlist(dl);
		System.out.println(" ");
		
		dl=Deleteatx(dl,2);
		printlist(dl);
		System.out.println(" ");
		

	}

}
