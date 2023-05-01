package class15;

public class E4instanceANDlocalANDstatic {

    static int age;  //instance
    String color = "blue"; // instance

    public static void main(String[] args) {
        double weight = 30; //local
        if (10 > 20) {
            int sum = 10;  //sum --->local variable
        }
        String breed; //local
    }

    String name; //----> instance variable ->created outside any block of code (like method,loop) but inside of class

   // static ---> can be accessed anywhere
    static String year;


}
