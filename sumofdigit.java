import java.util.*;
class sumofdigit
{
public static void main(String arg[])
{
int rem,rev=0,temp,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter no :");
int no=sc.nextInt();

while(no!=0)
{
rem=no%10;
sum=sum+rem;
no=no/10;
}

System.out.print("sum:"+sum);

}
}