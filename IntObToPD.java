public class IntObToPD {
 
  public static void main(String[] args) {
    Integer intObj = new Integer("10");
    byte b = intObj.byteValue();
    System.out.println(b);
    
    short s = intObj.shortValue();
    System.out.println(s);
    
    int i = intObj.intValue();
    System.out.println(i);
    
    float f = intObj.floatValue();
    System.out.println(f);
 
    double d = intObj.doubleValue();
    System.out.print(d);
  }
}