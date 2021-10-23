
//problem link : https://leetcode.com/problems/find-the-highest-altitude/submissions/
import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
         highestaltitude(gain);
        System.out.print("Result : ");
        System.out.print(  highestaltitude(gain));

    }
    static int highestaltitude(int[] arr){
        int sum=0;
        int max=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}




