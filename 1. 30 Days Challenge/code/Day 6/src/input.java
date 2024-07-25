import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 27;
        arr[2] = 2365;
        arr[3] = 235;
        arr[4] = 233;

        System.out.println(arr[3]);

        //INPUT USING FOR LOOPS
        Scanner in = new Scanner(System.in);

        int[] array = new int[5];
        for (int i =0;i< array.length;i++){
            array[i] = in.nextInt();
        }
        for (int i =0;i< array.length;i++){
            System.out.print(array[i] + " ");
        }

        for(int num : arr){
            System.out.println(num + " " );//here num represents element of array
        }
       // array of objects
        String[] str =new String[4];
        for (int i = 0; i< str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        //You can iterate through array elements using a traditional for loop, an enhanced for-each loop, or utilize the `Arrays.toString()` method for simple printing.

    }
}
