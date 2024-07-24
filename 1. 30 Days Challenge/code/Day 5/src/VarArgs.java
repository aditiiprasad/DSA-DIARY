import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      // when we dont know how many inputs we are giving - VARIABLE LENGTH ARGUMENTS
        fun(45,46,47,82,83,84);
        different(46,45,"aditi","mono");

    }

    static void different( int a, int b , String ...v ){

    }

    static void fun(int ...v){

        System.out.println(Arrays.toString(v));

    }
}
