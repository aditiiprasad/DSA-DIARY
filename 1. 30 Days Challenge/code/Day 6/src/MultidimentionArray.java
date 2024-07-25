import java.util.Arrays;
import java.util.Scanner;

public class MultidimentionArray {
    public static void main(String[] args) {
        /*
        1 2 3
        3 4 6
        4 7 6
         */

        int[][] arr = new int[3][3]; //no of columns not mandatory
       //The individual arrays within a 2D array can have varying sizes, making it possible to have jagged arrays where each row has a different number of columns.
        int[][] array = {
                {1,2,3},
                {3,4,6},
                {4,7,6}
        };

        //input

        Scanner in = new Scanner(System.in);
        //array.length` returns number of rows in a 2D array
        for (int row =0; row<arr.length;row++){
            //for each col in every row
            for (int col = 0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();

            }

        }
        for (int row =0; row<arr.length;row++){
            //for each col in every row
            for (int col = 0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+ " ");

            }
            System.out.println();

        }
        for (int row =0; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
