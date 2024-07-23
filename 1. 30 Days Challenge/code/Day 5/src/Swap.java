public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap two numbers
        swap(a,b);
        System.out.println(a+" " + b);

    }
    static void swap(int x , int y){
        int temp = x;
        x=y;
        y = temp;


    }

}
