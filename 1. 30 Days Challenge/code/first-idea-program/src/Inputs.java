import java.sql.SQLOutput;
import java.util.Scanner;

public class Inputs
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Roll Number:");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);

        int a = 10 ;
        // a= identifier 10= literal

        int b = 234_000_000 ;
        // instead of comma use '_'
        System.out.println(b);

        float marks = input.nextFloat();
        System.out.println(marks);

    }
}

