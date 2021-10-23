//problem link : https://leetcode.com/problems/flipping-an-image/
 import java.util.Arrays;
public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},
                           {1,0,1},{0,0,0}};
        int [][] output = flipAndInvertImage(image);
        System.out.println("Image before Flipping : " + Arrays.deepToString (image));
        System.out.println(" Flipped image  : " + Arrays.deepToString (output));

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int column = image[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < (column + 1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][column - j - 1]^1;
                image[i][column-j-1] = temp;
            }
        }
         return image;

    }


    }
