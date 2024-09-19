class BW
{

public static void main(String arg[])
{
int a=20,b=10,c;
c=a&b;
System.out.print("\n AND gate="+ c);
c=a|b;
System.out.print("\n OR gate="+c);
c=~b;
System.out.print("\n onec's compliment="+c);
c=a^b;
System.out.print("\n XOR agte="+c);
c=a<<2;
System.out.print("\n left shift="+c);
c=a>>2;
System.out.print("\n rigth shift="+c);
c=a>>>2;
System.out.print("\n rigth shift with fill zero="+c);

}
}