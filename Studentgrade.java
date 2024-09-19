import java.util.*;
class Studentgrade
{
	public static void main(String a[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Five Subject Marks :");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
	
		int total = m1+m2+m3+m4;
		float per = total/4;
		System.out.println("Total :"+total);
		System.out.println("Percentage :"+per);	
		if(per>=75)
			System.out.println("first class distinction");
		else if(per>=60)
			System.out.println("first class");
		else if(per==40)
			System.out.println("pass");
		else if(per<=35)
			System.out.println("fail");
		
	}
}