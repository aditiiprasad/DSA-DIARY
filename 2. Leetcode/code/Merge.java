public class Merge {
    

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count= 0;
        for (int index= m; index < nums1.length ; index++){

           nums1[index] = nums2[count];
           count++;

        }

        bubble(nums1);

       
       
    }
     static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
           
            if (!swapped) {
                break;
            }
        }
        
    }
}