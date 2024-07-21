import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
                // both should be compatible
                // destination type should be grater than the source type

        //TYPECASTING
        int number = (int)(67.56f);
        System.out.println((number));

        //automatic type promotion in expressions
          int a = 257;
          byte b = (byte)(a);  //257 % 256 = 1

        System.out.println(b);

        byte w = 40;
        byte x = 50;
        byte y = 100;
        int z = w * x / y;

        System.out.println(z);

        byte by = 42 ;
        char c = 'a' ;
        short s = 1024 ;
        int i = 50000 ;
        float f = 5.67f ;
        double d= 0.1234 ;
        double result = (f * by) + (i / c) - (d * s);
        // float + int - double = double

        System.out.println((f * by) + " " + (i / c) + " " + (d * s));
        System.out.println(result);


    }
}
