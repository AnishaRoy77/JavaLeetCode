
//problem link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;


public class Smaller1 {
    public static void main(String[] args) {
        int[] number = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(number);
        System.out.println("Input : " + Arrays.toString (number));
        System.out.println("Output : " + Arrays.toString(ans));


        }
       static  int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int[nums.length];
        int [] temp = new int[101];
        for(int i = 0; i<nums.length;i++) {
            temp[nums[i]]++;
        }
        //running sum
           for(int i = 1; i<101;i++){
               temp[i] += temp[i-1];
           }
           //storing ans
           for(int i =0; i<nums.length;i++){
               if(nums[i]== 0)
               {
                   ans[i] = 0;
               }
               else{
                   ans[i] = temp[nums[i] - 1];
               }
           }
           return ans;
   }
}