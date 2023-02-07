public class Java30 {
    public static void main(String []args){
     
        int nums[][]=new int[3][];
        nums[0]=new int[2];
        nums[1]=new int[3];
        nums[2]=new int[4];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
        }

        for(int x[]:nums){
            for(int y:x){
                System.out.println(y);
            }
        }

        int num[][][]=new int[3][][];
        num[0]=new int[2][];
        num[1]=new int[3][];    
        num[2]=new int[4][];
        num[0][0]=new int[2];
        num[0][1]=new int[3];
        num[1][0]=new int[4];
        num[1][1]=new int[5];
        num[1][2]=new int[6];
        num[2][0]=new int[7];
        num[2][1]=new int[8];
        num[2][2]=new int[9];
        num[2][3]=new int[10];
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                for(int k=0;k<num[i][j].length;k++){
                    num[i][j][k]=(int)(Math.random()*10);
                }
            }
        }
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                for(int k=0;k<num[i][j].length;k++){
                    System.out.print(num[i][j][k]+" ");
                }
            }
        }

    }

 

}
