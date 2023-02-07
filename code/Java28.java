public class Java28 {
    public static void main(String []args){
       int num[]={5,6,7}; //declaration and initialization 
char ch[]=new char[3]; //declaration and initialization
      
for(int i=0;i<ch.length;i++){
    System.out.println(ch[i]);
}
//how to fetch data from array
         System.out.println(num[0]);
            System.out.println(num[1]);
                System.out.println(num[2]);

                // i want to change 
                num[0]=10;
                num[1]=20;
                num[2]=30;
                System.out.println(num[0]);
            System.out.println(num[1]);
                System.out.println(num[2]);
                //how to print all data from array
                for(int i=0;i<num.length;i++){
                    System.out.println(num[i]);
                }
                //how to print all data from array using for each loop
                for(int i:num){
                    System.out.println(i);
                }
                //how to print all data from array using while loop
                int i=0;
                while(i<num.length){
                    System.out.println(num[i]);
                    i++;
                }
                //how to print all data from array using do while loop
                int j=0;
                do{
                    System.out.println(num[j]);
                    j++;
                }while(j<num.length);

                int nums[]=new int[3];
//by default value is 0

//literal notaiton to create array 
//int num[]={5,6,7};
//int num[]=new int[]{5,6,7}; this is not literal notation ,this is object notation with assignment of value
//int num[]=new int[3]; this is not literal notation ,this is object notation  



        
       
       
    }
}
