public class Ceiling {
// ceiling= smallest greatest number
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,1,2,3,7,8,9,10,11,12,13,14,15};
        int target=5;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    //return the index
    //return -1 if it does not exist
    static int  ceiling(int[] arr, int target){
        if (target>arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            //find middle element
            int mid = start + (end - start)/2;

            if (target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
