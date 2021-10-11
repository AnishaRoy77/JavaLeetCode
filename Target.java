//problem link: https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Target {
    public static void main(String[] args) {
        int [] number = {0,1,2,3,4};
        int [] ind = { 0,1,2,2,1};
        int [] result = createTargetArray(number , ind);
        System.out.println(Arrays.toString(result));
    }
    static int[] createTargetArray(int[] nums, int[] index){
        int[] target = new int[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0; i <nums.length ; i++){
            list.add(index[i] , nums[i]);
        }
        for(int i =0 ; i<nums.length;i++){
            target[i] = list.get(i);
        }
           return target;
    }
}
