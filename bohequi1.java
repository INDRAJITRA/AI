import java.util.*;
class bohequi1
{
	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);
		System.out.print("\nBinary Number : "+Integer.toBinaryString(no));
		System.out.print("\nOctal Number : "+Integer.toOctalString(no));
		System.out.print("\nHexa-decimal Number : "+Integer.toHexString(no));
	}
}