import java.util.*;
class linear_search{
	public static void main(String arg[])
	{
		int[] a=new int[5];
		int sele,f=0;
				Scanner s=new Scanner(System.in);
		System.out.println("Enter array :");
		for(int i=0;i<5;i++)
			a[i]=s.nextInt();
		System.out.println("Enter sele :");
		sele=s.nextInt();
		for(int i=0;i<5;i++)
		{
				if(a[i]==sele)
			    {
					 f=1;
					break;
				}
			
		}
		if(f==1)
		System.out.println("Ele Found :"+sele);
		else
		System.out.println("Ele not Found :"+sele);
	}
	
}