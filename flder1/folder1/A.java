package flder1.folder1;

// import flder1.folder2.B; -->The type flder1.folder2.B is not visible because class is not public
import flder1.folder2.C;
public class A {
    
public static   void main(String []args){
// B obj=new B(); --- not making class B as public --- we get error
C obj =new C();  //since, Class C is public so we can use outside the package
//class visibility defined only by public or default(this keyword is not written before the class but we say it is defautl e.g class B of folder2 is default)
   
//  System.out.println(obj.def); -- The field C.def is not visible because we want to access from different package than current package  and access specifier is by  default -- default.
//    System.out.println(obj.prot); not visible because access specifier is protected -- it is only in same package or visible in other package if this class extends that class
//protected visible to inherited class of different package also.

Child ch =new Child();
// ch.a; -- not visible in anywhere. Since a is visible only in same class because it is private.
    }
}

class Child extends C{
    private int a=9;
public void natureProtected(){
    System.out.println(prot); //here we can use protected variable becuase it is visible to inherited class in different package also
}
}
 
/*
 
Step 1:  create a folder  flder1
Step 2:  create two sub folder inside flder1 i) folder1 ii)folder2 
step 3:   create A.java file in folder1
step 4:  create B.java, C.java in folder2

package flder1.folder2;
 class B { 
}

package flder1.folder2;
public class C {
    int def=5;
    protected int prot=6;
    public int pub=7;
    private int pvt=8;
}


 */

