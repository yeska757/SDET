package class6;

public class E1LogicalOperators {
    public static void main(String[] args) {

        boolean cho = true;
        boolean flo = false;

        if (cho || flo) {
            System.out.println("I am happy");
        } else {
            System.out.println("I am sad");
        }

        boolean fiveG = false;
        boolean wifi = false;

        if (wifi || fiveG) {
            System.out.println("You can browse the internet");
        } else {
            System.out.println("Non connected to the internet");
        }

    }
}
