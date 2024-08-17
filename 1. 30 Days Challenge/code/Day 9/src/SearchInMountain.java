public class SearchInMountain {
    public static void main(String[] args) {

    }
    int search (int[] arr,int targets){

    }
    static int  binarySearch(int[] arr, int target){
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
        return -1;
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
