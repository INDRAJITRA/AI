import java.util.*;
class prime
{
 public static void main(String args[])
 {    
  int n,mid=0,f=0;      
  Scanner s=new Scanner(System.in);
  System.out.print("Enter number :"); 
  n=s.nextInt();
  mid=n/2;      
  if(n==0||n==1)
  {  
   System.out.print(n+" is not prime number");      
  }
  else
  {  
   for(int i=2;i<=mid;i++)
   {      
    if(n%i==0)
	{      
     System.out.print(n+" is not prime number");      
     f=1;      
     break;      
    }      
   } 
  }   
   if(f==0) 
    {
	System.out.print(n+" is prime number"); 
   }
 }   
}