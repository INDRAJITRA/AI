import java.lang.*;
class factorial
{
static int fact(int n)
{
  if(n==0)
  return 1;  
   return (fact(n-1)*n);
  }
public static void main(String arg[])
{
	int n=5;
 System.out.println("factorial"+fact(n));
}
}