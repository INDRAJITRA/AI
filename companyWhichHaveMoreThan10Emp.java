import java.util.*;
class companyWhichHaveMoreThan10Emp
{
  
  public static void main(String A[])
  { 
  
  String a1,b1,c1,d1;
		int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Company Name 1 :");
        a1=sc.next();		
		System.out.print("Enter Company Name 2 :");
        b1=sc.next();
		System.out.print("Enter Company Name 3 :");
        c1=sc.next();
		System.out.print("Enter Company Name 4 :");
        d1=sc.next();
		System.out.print("Enter Company 1 Employee :");
        a=sc.nextInt();
		System.out.print("Enter Company 2 Employee :");
        b=sc.nextInt();
		System.out.print("Enter Company 3 Employee :");
       c=sc.nextInt();
		System.out.print("Enter Company 4 Employee :");
        d=sc.nextInt();
	  
	  if(a>=10000)
		System.out.print("Company :"+a1);	
	 if(b>=10000)
		System.out.print("Company :"+b1);	
	 if(c>=10000)
		System.out.print("Company :"+c1);	
	 if(d>=10000)
		System.out.print("Company :"+d1);	
	
  }
}