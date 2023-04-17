package groupProject;

public class task5swap {
    public static void main(String[] args) {

        /*   5. Write a program to swap 2 numbers without a temporary variable?
         */

        int a = 21;
        int b = 8;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
