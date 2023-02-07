import java.util.ArrayList;

public class Java33 {
    public static void main(String []args){
        // why we need loop if we have many loop 
        //why do we need for enhanced loop
        //for each loop 
        //for each loop is used to iterate array and collection 
//#1

//for loop we can iterate array and collection
        // hey for loop give only value not index 
        int nums[]=new int[4];
        for(int n:nums){
            System.out.println(n);
        }
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);

        for(Object o:al){
            System.out.println(o);
        }
    }
}
