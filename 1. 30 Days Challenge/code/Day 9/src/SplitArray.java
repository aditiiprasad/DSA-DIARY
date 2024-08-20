public class SplitArray {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
        int start= 0;
        int end= 0;

        for (int i =0;i< nums.length;i++){
            start = Math.max(start,nums[i]);
            end+=nums[i];
        }
        // binary search
        while (start<end){
           //middle as potential answer
           int mid = start+(end-start)/2;

           //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces =1;
            for(int num : nums){
                if (sum+num>mid){
                    sum= num;
                    pieces++;
                }else {
                    sum+=num;
                }
            }
            if (pieces>k){
                start = mid+1;

            }else {
                end= mid;
            }
        }
        return end;
    }
}
