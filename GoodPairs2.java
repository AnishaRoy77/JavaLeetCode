

//Problem link: https://leetcode.com/problems/number-of-good-pairs/


//Optimized solution---->

import java.util.Arrays;

public class GoodPairs2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1, 1, 3};
        int result = numIdenticalPairs(num);
        System.out.println(result);
    }

    public static int numIdenticalPairs(int[] nums) {
        int[] temp = new int[101];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            count += temp[nums[i]];
            temp[nums[i]]++;
        }
        return count;
    }
}




