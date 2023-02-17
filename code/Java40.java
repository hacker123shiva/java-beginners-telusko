public class Java40 {
   public static void main(String []args){
   

   }
}

class A{
     void show(){ // -- by defualt access modifier is default
        System.out.println("A");
    }
    int a=5;
}

class B extends A{
     protected void show(){ //-- access modifier is protected -->we can increase visibilty
        System.out.println("B");
     }

}

