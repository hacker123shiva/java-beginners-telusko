public class Java14 {
    public static void main(String []args){
        //teranary operator --shorthand if-else
        //syntax
        //variable = (condition)? value if true : value if false
        int x=8;
        int y=7;
        int z=6;

        int max=(x>y && x>z)? x : (y>z)? y : z;
   
        int num=5;
        String result=(num%2==0)? "even" : "odd";
    }
}
