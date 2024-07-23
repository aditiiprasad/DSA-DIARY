import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String message = "Hello  " + name;
        return message;
    }
    static String greet(){
        String greet = " GOOD MORNING GUYS , GAYS AND GIRLIES";
        return greet;

    }
}
