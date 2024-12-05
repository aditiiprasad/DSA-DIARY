

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Aditi Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('d'));
        System.out.println("     bit  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}