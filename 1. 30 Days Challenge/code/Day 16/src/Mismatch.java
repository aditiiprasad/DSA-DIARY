import java.util.ArrayList;
import java.util.List;

public class Mismatch {

    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        int[] result = new int[2];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                result[0] =(nums[index]);
                result[1]=(index + 1);
            }
        }

        return result;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
