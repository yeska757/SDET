package class14;

public class E7Task1 {

    // Create a method that will take 2 parameters as a numbers and prints which number is larger

    void isLarger(int a, int b) {
        //sout(Math.max(a,b));
        if (a > b) {
            System.out.println(a + " is the larger number");
        } else if (b > a) {
            System.out.println(b + " is the larger number");
        }
    }

    public static void main(String[] args) {

        E7Task1 largerNumber = new E7Task1();
        largerNumber.isLarger(7, 3);


    }


}
