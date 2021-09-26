// problem link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class KidsCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies( candies, extraCandies);
        System.out.println(Arrays.toString(new List[]{result}));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>  result = new ArrayList<>(candies.length);
        int max = candies[0];
        for(int value : candies){
            if(value > max){
                max = value;
            }
        }
        for (int i=0;i<candies.length;i++){
            if (candies[i]+extraCandies>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}







