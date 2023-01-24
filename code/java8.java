public class java8 {
  public static void main(String []args){
    // what is type conversion or type casting 
    //type conversion is the process of converting a value from one data type to another data type  
    
  //type conversion and casting
  //every variable need a type 
  //change the type of a variable --no 
  //but we can assign a variable to another variable of a different type 
    //type conversion
    //automatic type conversion
    //byte -> short -> int -> long -> float -> double
    long l=10;
    float f=l;
    
    //Narrowing conversions can be done from a larger data type to a smaller data type, but they can result in loss of precision or data.
    //cause of loss of precision or data therefore in java we need to do it explicitly
    //explicit type conversion

    //when we get error in explicit type casting
    // 1. incompatible types: possible lossy conversion from long to byte
    // 2. incompatible types: possible lossy conversion from double to int
    // 3. incompatible types: possible lossy conversion from float to int
    // 4. incompatible types: possible lossy conversion from double to byte
    // 5. incompatible types: possible lossy conversion from float to byte
    // 6. incompatible types: possible lossy conversion from double to short
    // 7. incompatible types: possible lossy conversion from float to short
    // 8. incompatible types: possible lossy conversion from double to long
    // 9. incompatible types: possible lossy conversion from float to long
    // 10. incompatible types: possible lossy conversion from double to char
 
 
    byte b=(byte)l;
    System.out.println(b);
    //257%256=1  
float fll='a';
    //type promotion
    //when we do arithmetic operation on two different data types, java will promote the smaller data type to the larger data type 
    //byte -> short -> int -> long -> float -> double
    byte a1=10;
    byte a2=20;
    int a3=a1*a2;
    System.out.println(a1*a2);
    System.out.println(a3);

    // int / int = int 
    // int / float = float
    // int * float = float
    // short * short = int
    
    // short * int = int
    // short * long = long
    // byte * byte = int
    
    byte b1=120; byte c1=120;
    System.out.println(b1*c1);
  }  
}
