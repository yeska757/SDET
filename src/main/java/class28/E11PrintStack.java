package class28;

public class E11PrintStack {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {

            System.out.println(e);//java.lang.ArithmeticException: / by zero

//            e.printStackTrace();//java.lang.ArithmeticException: / by zero
            //at class28.E11PrintStack.main(E11PrintStack.java:7)


            System.out.println(e.getMessage());  /// by zero
        }
        System.out.println("1");


    }
}
