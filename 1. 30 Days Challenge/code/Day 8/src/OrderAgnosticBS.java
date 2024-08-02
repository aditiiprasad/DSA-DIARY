public class OrderAgnosticBS {
    public static void main(String[] args) {
     //ascending array
      int[] arr = {-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
      int target=2;
      int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    // descending array
        int[] array = {3,2,1,0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14,-15};
        int targets=-12;
        int answer = orderAgnosticBS(array,targets);
        System.out.println(answer);


    }
    static int orderAgnosticBS(int[] arr,int target){
        int start =0;
        int end = arr.length-1;

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
