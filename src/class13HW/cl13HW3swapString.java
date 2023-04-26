package class13HW;

public class cl13HW3swapString {
    public static void main(String[] args) {

        //    How would you swap  2 strings without a temporary variable?


        String a = "first";
        String b = "second";

        b = a + b;
        a = b.replace(a, "");
        b = b.replace(a, "");

        System.out.println(a);
        System.out.println(b);


    }
}
