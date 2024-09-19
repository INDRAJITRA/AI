package p1;
 public  class Maths
{
	 double sr(int n)
	{
		return Math.sqrt(n);
	}
		  double fact(int n)
	{
		if(n==0)
			return 1;
		return (n*fact(n-1));
		
	}
		 double cr(int a)
	{
		return Math.cbrt(a);
	}
	
}