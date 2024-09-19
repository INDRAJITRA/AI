import java.util.*;
class SwapWithoutTemp
{
	public static void main(String ar[])
	{
		int a,b;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter A :");
	a=s.nextInt();
	System.out.print("Enter B :");
	b=s.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.print("Enter A :"+a);
	System.out.println("Enter B :"+b);
}
}