import java.util.*;
class StringFun
{
public static void main(String arg[])
{
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter String : ");
   String s1=sc.nextLine();
    s1=s1.replace('Y','S');
   System.out.println("\n After Replacing char string : "+s1);
     System.out.println("string : "+s1);
   s1=s1.toLowerCase();
   System.out.println("\nLower Case String : "+s1);
   s1=s1.toUpperCase();
   System.out.println("\nUpper Case string : "+s1);
   s1=s1.replace('Y','S');
   System.out.println("\n After Replacing char string : "+s1);
   s1=s1.trim();
   System.out.println("\nAfter Triming string : "+s1);
   System.out.println(" enter Second string : ");
   String s2=sc.nextLine();
   System.out.println("string : "+s2);
	if(s1.equalsIgnoreCase(s2))
	System.out.println("\n equals : "+s1+" == "+s2);
	else
   System.out.println("\n Not equals : "+s1+" != "+s2);
   System.out.println("\n String Lentgh : "+s1.length());
   System.out.println("\n 4th char of string : "+s1.charAt(4));   
 int c1=s1.compareTo(s2);
   if(c1>0)
   System.out.println("\n"+s1+" > "+s2);
   else if(c1<0)
   System.out.println("\n"+s1+" < "+s2);
   else
   System.out.println("\n"+s1+" = "+s2);
   System.out.println("\n After concat s1 &s2 :"+s1.concat(s2));
   
   s1=s1.substring(11);
   System.out.println("\n String  : "+s1);
   int c2=s1.indexOf('v');
      System.out.println("\n Index : "+c2);
   int c3=s1.indexOf('v');
      System.out.println("\n Index : "+c3);
   }
}