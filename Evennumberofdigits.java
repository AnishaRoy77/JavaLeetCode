//problem link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Evennumberofdigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static  int findNumbers(int[] nums) {
        int ans = 0;
        for(int i =0; i<nums.length;i++){
            int digit = (int)Math.log10(nums[i])+1;
            if( digit % 2 == 0){
                ans++;
            }
        }
        return ans;

    }
}
