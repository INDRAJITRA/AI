import java.util.*;
class eveninlongdigit
{
	public static void main(String ar[])
	{
		int n,c=0,rem=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	while(n!=0)
	{
		rem=n%10;
		if(rem%2==0)
	    {
			
			System.out.println(" even : "+rem);
			c++;
		}
		n/=10;
		
	}
	System.out.println("All even in Digit: "+c);
	
	}
}