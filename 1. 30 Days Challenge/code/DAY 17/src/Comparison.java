

public class Comparison {
    public static void main(String[] args) {
        String a = "Aditi";
        String b = "Aditi";
        String c = a;
        System.out.println(c == a);
        // ==
        System.out.println(a == b);

        String name1 = new String("Aditi");
        String name2 = new String("Aditi");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}