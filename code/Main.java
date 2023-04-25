 class Main{
  public static void main(String []arags){
B obj=new B();
obj.show();
  }
 }

 class A{
private int a;
protected int b;
public int c;
int d;
 }

 class B extends A{
public void show(){
// System.out.println(a); // error
System.out.println(b); // ok
System.out.println(c);
System.out.println(d);
 }
}