import java.util.Arrays;

class Practice {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }

     static int[] twoSum(int[] nums , int target ){
        for(int i = 0; i <nums.length;i++){

            for(int j = i+1; j<nums.length;j++){
               if(nums[i]+nums[j]==target){

                   return new int[] {i,j};
               }

            }
        }
         return new int[] {};
    }

}