import java.util.*;
class reverse
{
public static void main(String arg[])
{
int no,rem,rev=0,temp,sum=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter no :");
no=s.nextInt();

while(no!=0)
{
rem=no%10;
sum=sum+rem;
no=no/10;
}

System.out.print("sum:"+sum);

}
}