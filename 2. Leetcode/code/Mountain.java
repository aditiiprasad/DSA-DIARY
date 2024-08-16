public class Mountain {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,5,5,6,7,8,6,4,3,2};
         int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end= arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
             if (arr[mid]>arr[mid+1]){
                 //decreasing part of array
                 //this can be the answer but lets look at left
                 end=mid;
             }else{
                 //ascending part of array
                 start=mid+1;//because we know that mid+1 is greater than mid

             }
        }
        //in the end start == end and pointing to largest no
        return start;
    }
}
