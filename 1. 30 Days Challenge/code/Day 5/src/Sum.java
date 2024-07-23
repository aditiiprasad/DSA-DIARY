import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        //without return value
        sum();

        //with return value
        int ans = sum2();
        System.out.println(ans);

        //pass the value of number when you are calling the method in main()
        int answer = sum3(30,70);
        System.out.println(answer);

    }

    //without return value
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num2 + num1;
        System.out.println("The sum = " + sum);

    }

    //with return value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }

    //pass the value of number when you are calling the method in main()
    static int sum3(int a , int b){
        int sum = a + b;
        return sum;

    }
}
