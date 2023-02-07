public class Java29 {
   public static void main(String []args){
    //multidimensional array
    //what is multidimension array? 
    //array of array  or array inside array 
    //what is use of multidimension array?      
    //int num[][]=new int[3][3];
    
    


    int num[][]={{1,2,3},{4,5,6},{7,8,9}};
    //can we form array of array
    //int num[][]=new int[3][3];
    //multidimension array
    //one array can storee three sub array
    //row index and column index
    // row index is 0,1,2
    //column index is 0,1,2
    int random =(int)Math.random()*1000;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            random =(int)(Math.random()*1000);
            num[i][j]=random;
            
        }
    }

    // enhaced for loop
    for(int i[]:num){
        for(int j:i){
            System.out.print(j+" ");
        }
        System.out.println();
    }
   } 
}
