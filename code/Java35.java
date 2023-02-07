public class Java35 {
   public static void main(String []args){
    String name="shiva";
    name=name+"Srivastava";
    //you are not changing the string object
    //you are creating new string object  
    //and assigning it to name variable 
    //name="shiva"+"Srivastava";
    //name="shivaSrivastava";
    // ways to create string object 
    //1. String literal
    //2. new keyword
    //3. String pool
    

    String s1="shiva";
    String s2="shiva";
        System.out.println(s1==s2);
    //s1 and s2 are pointing to same object 
    //why ?
    //because string pool  
    //string pool is a memory area  

    // in heap special  area called String constant pool 
    //s1 and s2 are pointing to same object "shiva" 

    s1="shiva"+"Srivastava";
    String s3="shivaSrivastava";
    String s4="Srivastava";
    s2=s1+s4;
    System.out.println(s1==s2);
    System.out.println(s1==s3);
    System.out.println(s2==s3);
    System.out.println(s1==s2);

    //mutable and immutable string 
    //mutable string means you can change the string
    //immutable string means you can not change the string
    //String is immutable
    //StringBuffer is mutable
    //StringBuilder is mutable

   } 
}
