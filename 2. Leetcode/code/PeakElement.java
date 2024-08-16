class findPeakement {
    public int ElfindPeakement(int[] nums) {
        int start=0;
        int end= nums.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
             if (nums[mid]>nums[mid+1]){
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
