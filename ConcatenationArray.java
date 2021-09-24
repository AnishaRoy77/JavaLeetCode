
// https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;
public class ConcatenationArray
{
    public static void main(String[] args) {
        int [] number = {1,2,1} ;

        int[] ans = getConcatenation(number);
        for(int i = 0; i <number.length; i++){
            System.out.println(number[i] + ", ");
        }
        System.out.println(Arrays.toString(ans));



    }



    public static int[] getConcatenation(int[] nums){

        int [] ans = new int[2*nums.length];
        for(int i = 0 ; i < nums.length; i++)
        {
            ans[i] = nums[i];

            ans[i+nums.length]=  nums[i];
        }
        return ans;
    }

}



