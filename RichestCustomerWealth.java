//https://leetcode.com/problems/richest-customer-wealth/

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] acc = {{1,2,3} , {4,3,1}};
        int maxWealth = maximumWealth(acc);
        System.out.println("The maximum  wealth is: " + maxWealth );
        //System.out.print(Arrays.toString(new int[]{maxWealth}));


    }
    public static int maximumWealth(int[][] accounts){
        int maxWealth = Integer.MIN_VALUE;
        for(int i = 0 ; i<accounts.length; i++){

            int rowSum=0;

            for(int j =0; j<accounts[i].length;j++){

                rowSum += accounts[i][j];
            }if(rowSum > maxWealth){
                maxWealth = rowSum;
            }

            }
        return maxWealth;
    }
}
