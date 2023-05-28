package class19;

public class Math {

    // method overloading -- has the same name but different data type of parameters
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void add(int num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void add(long num1, long num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }


    public static void main(String[] args) {
        add(10, 20);
        add(12, 15);
        add(10, 20.5);
        add(2.5, 5.6);
        add(44.3, 2);

    }
}
