public class Shadowing {
    static int x = 46; //this will be shadowed at line 7

    public static void main(String[] args) {
        System.out.println(x); //46
        int x =40;
        System.out.println(x); //40 as lower level is overriding upper level.
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
