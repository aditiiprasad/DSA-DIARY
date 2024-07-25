import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //SYNTAX
        ArrayList<Integer> list =new ArrayList<>(10);

        list.add(67);
        list.add(76);

        System.out.println(list);


        System.out.println(list.contains(34));

        //ArrayList in Java allows dynamic resizing without specifying size.
        //ArrayList capacity increases dynamically by doubling its size when it reaches a certain threshold.
        //ArrayList supports methods like add, remove, update, set, contains, and more for manipulating elements.
        //ArrayList provides an amortized constant-time complexity for adding elements due to its dynamic resizing strategy.
    }
}
