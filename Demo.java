import java.util.*;
class Demo
{
	public static void main(String A[])
	{
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		int n=a.length;
		for(int i=0;i<a.length;i++)
		a[i]=s.nextInt();
	
	 System.out.print("\n  Title="+n);
	 for(int i=0;i<a.length;i++)
		 a[i]=a[n-i-1];
	 
	  for(int i=0;i<a.length;i++)
		System.out.print(a[i]); 
}
}
