public class Main {
    public static void main(String[] args) {
      int[] nums = {2233,3,44,43,4,334,34,6,44,33,6666,702,32};
      int target = 134;
      int ans = linearSearch(nums,target);
        System.out.println(ans);


    }
    // search in the array : return the index if item found
    // otherwise -1

    static int linearSearch(int[] arr , int target){
        if (arr.length==0){
            return -1;
        }

        for (int index=0;index< arr.length;index++){
            int element = arr[index];
            if (element==target){
                return  index;
            }

        }
        return -1;
    }

}
