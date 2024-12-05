import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);

        Integer num = Integer.valueOf(56); // Use valueOf instead of new Integer()
        System.out.println(num.toString());
        System.out.println(num);

        System.out.println("Aditi");

        System.out.println(new int[]{2,9,3,3,4}); //wrong
        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5}));

        String name = null;
        System.out.println(name);
    }
}
