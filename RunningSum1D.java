//https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class RunningSum1D {
    public static void main(String[] args) {
        int[] number = {1,2,3,4 };
        int[] num = runSum(number);
        System.out.print("Result : ");
        System.out.print(Arrays.toString(num));

    }
    static int[] runSum(int[] num){
        for(int i = 1 ; i<num.length;i++){
            num[i] = num[i] + num[i-1];
        }
        return num;

    }
}

