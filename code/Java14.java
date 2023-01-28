public class Java14 {
    public static void main(String []args){
        //teranary operator --shorthand if-else
        //ternary operator is a shorthand if-else statement
            //  why we need ternary operator?
            // 1. to reduce the code
            // 2. to make the code more readable
            // 3. to make the code more compact

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
