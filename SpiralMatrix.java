//Problem link:https://leetcode.com/problems/spiral-matrix/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] matrix = { {1,2,3,4} , {5,6,7,8} ,{9,10,11,12}};

       System.out.println(spiralOrder(matrix));
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<Integer>();

        int row = matrix.length;
        if(row==0)
            return answer;

        int col= matrix[0].length;

          int left =0 , right = col-1 , top = 0 , bottom = row-1 , direction = 0;


          while (left <= right && top <= bottom){
              if(direction == 0){
                  for(int i = left; i <= right ; i++){
                      answer.add(matrix[top][i]);
                  }
                  direction = 1;
                  top++;
              }else if(direction==1){
                  for(int i=top; i<=bottom; i++){
                      answer.add(matrix[i][right]);
                  }
                  direction=2;
                  right--;
              }else if(direction==2){
                  for(int i= right; i>=left;i--){
                      answer.add(matrix[bottom][i]);
                  }
                  direction =3;
                  bottom--;
              }else if(direction==3) {
                  for (int i = bottom; i >= top; i--){
                      answer.add(matrix[i][left]);

              }
                  direction = 0;
                  left++;
              }
          }
          return answer;
    }

    }
