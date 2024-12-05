import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  // add ASCII values

        System.out.println("a" + "b");  // concatenate strings

        System.out.println('a' + 3);    // ASCII value + number

        System.out.println((char) ('a' + 3));  // sum converted back to char using ASCII value

        System.out.println("a" + 1);
        // This is the same as: "a" + "1"
        // Integer will be converted to String using toString()

        System.out.println("Aditi" + new ArrayList<>());  // Concatenate with an empty ArrayList
        System.out.println("Aditi" + Integer.valueOf(56)); // Use Integer.valueOf() instead of deprecated constructor

        String ans = Integer.valueOf(56) + "" + new ArrayList<>();  // Concatenate with an empty ArrayList
        System.out.println(ans);

        System.out.println("a" + 'b');  // Concatenate string with a character
    }
}
