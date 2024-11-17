public class HeightChecker {
    

    public int heightChecker(int[] heights) {


        int[] expected = heights.clone();
        for (int i = 0; i < expected.length -1 ;i++){

            for (int j = i+1; j>0; j--){

                if(expected[j] < expected[j-1]){

                    swap(expected, j, j-1);
                } else {
                    break;

                }

            }

        }
        int count = 0;
        for(int a=0 ; a<expected.length;a++){
            if(expected[a] != a){
                count++;
            }

        }


          return count;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}