
// problem link-->  https://leetcode.com/problems/shuffle-the-array/


import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {

            int [] numbr = { 2,5,1,3,4,7} ;
            int n = 3;
            int [] ans = shuffle(numbr , n);
            System.out.println("Input Array : " + Arrays.toString(numbr));

            System.out.print("Shuffled Array : " + Arrays.toString(ans));

        }
        public static int[] shuffle(int[] nums , int n){
            int[] ans = new int[2*n];

            int x = 0;
            for(int i = 0; i<ans.length; i+=2) {
                ans[i] = nums[x];
                ans[i + 1] = nums[x + n];
                x++;
            }
            return ans;
        }

    }
