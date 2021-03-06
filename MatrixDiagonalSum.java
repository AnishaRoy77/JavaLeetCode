//Problem link : https://leetcode.com/problems/matrix-diagonal-sum/

import java.util.Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int [][] mat ={{1,2,3},
                {4,5,6},{7,8,9}};
        diagonalSum(mat);
        System.out.println("Diagonal sum :" + diagonalSum(mat) );

    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
       // int n = mat.length;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][i];
        }
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][mat.length- i - 1];
        }
        //if column  = odd then sum of diagonals - middle element
        if(mat.length % 2 != 0){
            sum -= mat[mat.length/2][mat.length/2];
        }// if column = even then it will return the sum of diagonal(i.e. it will return sum)
        return sum;
    }
}

    





