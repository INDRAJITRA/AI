import java.util.*;
class Math{
int a,b;
void accept(){
Scanner s=new Scanner(System.in);
System.out.print("\n Enter A:- ");
a=s.nextInt();
System.out.print("\n Enter B:- ");
b=s.nextInt();
}
}
class Add extends Math{
void addition(){
System.out.print("\n Addition= "+(a+b));
}
}
class Sub extends Math{
void substraction(){
System.out.print("\n substraction= "+(a-b));
}
}
class Mul extends Math{
void multiplication(){
System.out.print("\n multiplication= "+(a*b));
}
}
class Div extends Math{
void division(){
System.out.print("\n division= "+(a/b));
}
}
class hierarchydemo{
public static void main(String arg[]){
Add a1=new Add();
Sub s1=new Sub();
Mul m1=new Mul();
Div d1=new Div();
a1.accept();
a1.addition();
s1.accept();
s1.substraction();
m1.accept();
m1.multiplication();
d1.accept();
d1.division();	
}
}





