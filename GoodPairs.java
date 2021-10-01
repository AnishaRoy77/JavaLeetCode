//Problem link: https://leetcode.com/problems/number-of-good-pairs/


//Brut Force Approach---->

import java.util.Arrays;

public class GoodPairs {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1, 1, 3};
        int result = numIdenticalPairs(num);
        System.out.println(result);
    }

    public static int numIdenticalPairs(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count += 1;
                }
            }
        }
        return count;
    }
}