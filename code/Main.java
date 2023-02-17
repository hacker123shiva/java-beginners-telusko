 class Main{
   public static void main(String []args){
      int i=2;
      int j=3;
      int arr[]={1,2,3,4,5};

      try{
         j=i/j;
         System.out.println(arr[5]);
      }
      catch(ArithmeticException e){
         System.out.println("Arithmetic Exception");
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println("ArrayIndexOutOfBounds Exception");
      }
      catch(Exception e){
         System.out.println("Exception");
      }
       
   }
 }