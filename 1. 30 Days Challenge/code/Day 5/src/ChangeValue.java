import java.util.Arrays;
import java.util.Scanner;

public class ChangeValue {
    public static void main(String[] args) {
        //Create an array
        int[] arr = {1,2,3,4,5,46};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;
    }
}
