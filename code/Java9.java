public class Java9 {
    public static void main(String ...arg){
         
        
        //Assignment operator
        // = 
//         1)Assignment operator 
//   =  is used to assign a value to a variable
//  += is used to assign a value to a variable by adding it to the existing value
//  -= is used to assign a value to a variable by subtracting it from the existing value
//others are *=, /=, %=, &=, |=, ^=, >>=, <<=, >>>=
       int num1=11;
         int num2=12;
        int result = num1 + num2;
        int result1=num1-num2;
        int result2=num1*num2;
        int result3=num1/num2;

        System.out.println("Result: " + result);
 //+= 
 int num3=11;
 num3=num3+1;
    System.out.println(num3);

    num3 += 1;
    System.out.println(num3);

    num3++; //post increment by 1 
    System.out.println(num3);
++num3; //pre increment by 1 
    //-=
    int num4=11;
    num4=num4-1;
    System.out.println(num4);

    num4 -= 1;
    System.out.println(num4);
int s=5;
int t;
t=s++;
System.out.println(t);
    }
}


// can we use vararg at place of array  in java
// yes we can use vararg at place of array in java 
//is converse is true
// no converse is not true why because vararg is not an array
//example that converse is not true
 class Java10 {
    public static void main(String []arg){
        int []arr={1,2,3,4,5};
        fun(arr);
    }
    public static void fun(int ...arr){
        System.out.println("vararg");
    }
}

// can we use array at place of vararg in java
// yes we can use array at place of vararg in java
//is converse is true
// no converse is not true why because array is not vararg

//example that converse is not true
 


