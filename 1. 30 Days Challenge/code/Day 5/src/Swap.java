//public class Swap {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        //swap two numbers
//        swap(a,b);
//        System.out.println(a+" " + b);
//
//    }
//    static void swap(int x , int y){
//        int temp = x;
//        x=y;
//        y = temp;
//
//
//    }
//
//}

public class Swap {
    public static void main(String[] args) {
        // Create instances of the wrapper class
        NumberWrapper a = new NumberWrapper(10);
        NumberWrapper b = new NumberWrapper(20);

        // Print initial values
        System.out.println("Before swap: a = " + a.value + ", b = " + b.value);

        // Swap the values
        swap(a, b);

        // Print swapped values
        System.out.println("After swap: a = " + a.value + ", b = " + b.value);
    }

    // Wrapper class to hold integer values
    static class NumberWrapper {
        int value;

        NumberWrapper(int value) {
            this.value = value;
        }
    }

    // Swap method that swaps the values of the NumberWrapper instances
    static void swap(NumberWrapper x, NumberWrapper y) {
        int temp = x.value;
        x.value = y.value;
        y.value = temp;
    }
}
