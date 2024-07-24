public class Overloading {
    public static void main(String[] args) {
        //FUNCTION OVERLOADING = WHEN TWO OR MORE FUNCTIONS HAVE SAME NAME BUT DIFFERENT ARGUMENTS
         fun(46);
         fun("ADITI");
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String a){
        System.out.println(a);

    }
}
