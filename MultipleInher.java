interface exam
	{
		public int Per_cal();
	}   
	class st 
	{
		int rn,m1,m2;
		String nm=new String();
		void accept()
		{
			Scanner sc= new Scanner();
			
			System.out.println("ENTER ROLL :");
			rn=sc.nextInt();
			System.out.println("ENTER NAME :");
			nm=sc.next();
			System.out.println("ENTER SUBJECT 1 MARK");
			m1=sc.nextInt();
			System.out.println("ENTER SUBJECT 2 MARK");
			m2=sc.nextInt();
		}
	void display()
	{
		System.out.println("STUDENT ROLL :");
		System.out.println("STUDENT NAME :");
		
	}
	}
class Res extends st implements exam
	{  
		public int Per_cal()
			{	
				return System.out.println("Total Marks : "+(m1+m2));
			} 
		public static void main(String A[])
		{
			Res r=new Res();
			r.accept();
			r.display();
			r.Per_cal();
			
		}
	}





