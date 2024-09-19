import java.util.*;
class MoreTestPlayed
{
	public static void main(String A[])
	{
		String a1,b1,c1;
		int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name Player 1 :");
        a1=sc.next();		
		System.out.print("Enter Name Player 2 :");
        b1=sc.next();
		System.out.print("Enter Name Player 3 :");
        c1=sc.next();
		System.out.print("Enter Player 1 mathces :");
        a=sc.nextInt();
		System.out.print("Enter Player 2 mathces :");
        b=sc.nextInt();
		System.out.print("Enter Player 3 mathces :");
        c=sc.nextInt();
		
		if(a >= b && a >= c)
		
			
			System.out.print("Player 1 is played more mathces:"+a1);
    else if(b >= a && b >= c)
		
		
		System.out.print("Player 2 is played more mathces:"+b1);
	else
		System.out.print("Player 3 is played more mathces:"+c1);	
	}
	
	
}