//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
//package for input

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Hello World.");

//        'ln' in println means new line .

        System.out.println("My name is Aditi");
        System.out.println("How are you?");
// INPUT AND OUTPUT

        //INTEGER
        Scanner integer = new Scanner(System.in);
        System.out.println(integer.nextInt());

        //STRING (prints until it finds a gap)
        Scanner string = new Scanner(System.in);
        System.out.println(string.next());

        //STRING (prints full line)
        Scanner fullLine = new Scanner(System.in);
        System.out.println(fullLine.nextLine());


    }
                  }
