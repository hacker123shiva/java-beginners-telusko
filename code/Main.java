class Main{
   public static void main(String []args){
      int a=0;
      try{
         if(a==0)
throw new ArithmeticException("a should not be zero");
      }
      catch(ArithmeticException e){
         System.out.println("Exception caught: "+e);
      }
    
   }
}