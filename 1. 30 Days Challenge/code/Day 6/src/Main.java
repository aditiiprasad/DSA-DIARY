public class Main {
    public static void main(String[] args) {
        /*Arrays are collections of data types, and their syntax includes the data type and size declaration.
        Arrays in Java are stored in the heap memory, and heap objects are not guaranteed to be continuous.
         */
        //SYNTAX
        // datatype[] name = new datatype[size];

        int[] rollno = new int[3];

        /* int[] rollno ; declaration of array. rollno is getting defined in the stack - compile time
           rollno = new int[5]; initialization, here object is being created in heap memory - run time

           The "new" keyword is used to create objects in Java, including arrays. It's associated with dynamic memory allocation.

         */

        //OR

        int[] rollNo = {45,46,47};

        //Array indices start from 0, and accessing elements is done using these indices

        System.out.println(rollno[1]); //0

        String[] arr = new String[5];
        System.out.println(arr[1]);   //null

        //"null" is a special literal in Java representing the absence of a value and is commonly used for uninitialized reference variables.








    }
}
