public class SearchInArray {
    public static void main(String[] args) {
       int[][] arr = {
               {1,2,3,4},
               {33,2,3,11},
               {18,19},
               {18,12}
                     };
       int target = 19;
       int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[][] arr, int target){
       for(int row = 0 ; row < arr.length;row++){
           for (int col =0 ; col<arr[row].length;col++){
               if (arr[row][col]==target){
                   int[] index = {row,col};
                   return index;
               }
           }

       }
           return 0;
    }
}