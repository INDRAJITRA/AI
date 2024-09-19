import java.util.*;
class pali
{
public static void main(String arg[])
{
int no,rem,rev=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter no :");
no=sc.nextInt();
int t=no;
while(no!=0)
{
rem=no%10;
rev=rev*10+rem;
no=no/10;
}
if(t==rev)
System.out.print("palindrome :- \n no="+t+"\t rev ="+rev);
else
	System.out.print("not palindrome :-\n no="+t+"\t rev ="+rev);

}
}