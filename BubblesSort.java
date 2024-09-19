import java.util.*;
class BubblesSort{
 
 public static void main(String Ar[])
 {
	 int a[]=new int[10];
	 Scanner s=new Scanner(System.in);
	 for(int i=0;i<10;i++)
	 {
		 a[i]=s.nextInt();
	 }
	 System.out.println("Orignal Array :");

for(int i=0;i<10;i++)
{
System.out.println(a[i]);
}
	
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{	
if(a[i]<a[j])
{
	int t=a[i];
		a[i]=a[j];
		a[j]=t;
}}}	
System.out.println("After Sorting :");
for(int i=0;i<10;i++)
{System.out.println(a[i]);
}
 }
}