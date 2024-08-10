//floor = greatest smaller no
public class Floor {
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,1,2,3,4,9,10,11,12,14,15};
        int target=13;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    //return the index
    //return -1 if it does not exist
    static int  floor(int[] arr, int target){
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
        return end;
    }
}
