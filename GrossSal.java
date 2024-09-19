import java.util.*;

class Emp
{
	int age;
	String nm=new String();
	void acc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER AGE OF EMP :");
		age=sc.nextInt();
		System.out.print("ENTER NAME OF EMP :");
		nm=sc.next();
		
		
		}
		
}

class GrossSal implements Sal extends Emp
{
	int ta,da,hra;
void totalSal()
	{
	da=basic_salary+(basic_salary*(90/100));
	hra=basic_salary+(basic_salary*(10/100));
	ta=da+hra+basic_salary;
	System.out.print("Total Sal :"+ta);
	}

	public static void main(String h[])
	{
		GrossSal m=new GrossSal();
		m.acc();
		m.totalSal();
	}
}