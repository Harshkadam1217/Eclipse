class solution
{
 public static void main(String args[])

 {
   Scanner sc=new Scanner(System.in);
   int[] a=new int[100];
   int n=sc.nextInt();
   int[] b=new int[n];
   for(int i=0;i<n;i++)
   {
    a[i]=sc.nextInt();
    if(a[i]<n)
    {
     b[i]=a[i];
    }
   }
 }


}