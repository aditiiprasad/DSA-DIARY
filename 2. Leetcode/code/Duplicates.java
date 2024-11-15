class Duplicates  {
    public int findDuplicate(int[] arr) {

        //cycle sort
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                swap(arr,i, correct);

            }else{
                i++;
            }
        }
// duplicate= the one not on his index
        for(int index =0; index <arr.length; index++) {
            if (arr[index] != index + 1) {
                return arr[index];
            }
        }
        return 0;
    }

  //Swap function
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
