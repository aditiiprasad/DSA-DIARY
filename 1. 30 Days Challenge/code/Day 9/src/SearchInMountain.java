public class SearchInMountain {
    public static void main(String[] args) {

    }
    int search (int[] arr,int targets){
        int peak = peakIndexInMountainArray(arr);
        int firstTry=binarySearch(arr,targets,0,peak);
        if( firstTry!=-1){
            return  firstTry;

        }
        return orderAgnosticBS(arr,targets,peak+1,arr.length-1);
    }
    static int  binarySearch(int[] arr, int target,int start,int end){


        while(start<=end){

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

                end=mid;
            }else{

                start=mid+1;

            }
        }

        return start;
    }
    static int orderAgnosticBS(int[] arr,int target,int start,int end){


        //find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];


        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            //asc
            else if(isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }
            }
            //des
            else {
                if (target>arr[mid]){
                    end=mid-1;
                }else if(target<arr[mid]){
                    start=mid+1;
                }
            }

        }
        return -1;
    }

}
