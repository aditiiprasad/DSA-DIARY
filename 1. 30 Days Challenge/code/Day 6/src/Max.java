public class Max {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,5,5};
        System.out.println(max(array));
    }
    static int max(int[] array){
        int maxVal = array[0];
        for (int i = 0;i< array.length;i++){
           if (array[i]>maxVal){
               maxVal = array[i];
           }
        }
        return maxVal;
    }
}
