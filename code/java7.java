class Main{
    public static void main(String[] args){
         //literal 
         //what is literal?
            // literal is a source code representation of a fixed value. 
            int a = 10; //decimal
            int b = 0b1010; //binary
            //literal in binary must start with 0b or 0B
            int c = 012; //octal
            //literal in octal must start with 0
            int d = 0xA; //hexadecimal
            //literal in hexadecimal must start with 0x or 0X
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);

        //underscore between numbers
        //underscore can be used between numbers to make it more readable
            int e = 1_000_000;
            System.out.println(e); 
            int f = 0b1010_1010;
            System.out.println(f);
//4.5f is a float literal //f is a suffix
            float g = 4.5f;
            System.out.println(g);
            //
        //underscores at the beginning or end of a number
            // int g = 1_000_000_; //error //cannot put underscore at the end
            // System.out.println(g);
            // int h = _1_000_000; //error //cannot put underscore at the beginning
            // System.out.println(h);
 
            //double 
            double i = 1_000_000.0;
            System.out.println(i);
            // double with e 
            double j = 1_000_000e-3;
            System.out.println(j);
            // double with E
            double k = 1_000_000E-3;
            System.out.println(k);
            // double with f
            double l = 1_000_000f;
            System.out.println(l);
            // double with F
            double m = 1_000_000F;// what is f and F for? 
                // f and F are used to indicate that a literal is a float.
            System.out.println(m);
            // double with d
            double n = 1_000_000d; //default
            System.out.println(n);
  double x=34e10;
    System.out.println(x);

    char ch='a';
    System.out.println(ch);

    ch++;
    System.out.println(ch);
    
System.out.println(4_45_67_89);
System.out.println(0b1010_1010);
System.out.println( 3.4_5);
System.out.println(3.44e10); //

    }
}