package class3;

public class E16RelationalOperators {
    public static void main(String[] args) {

        /*
        > more
        < less
        == equals
        != not equals
        >= more or equal(both checked)
        <= less or equal(both checked)
        */

        int num1 = 10;
        int num2 = 20;
        boolean result = num1 > num2;
        System.out.println(result); //false
        System.out.println(num1 > num2); //false
        System.out.println(num1 < num2); //true
        System.out.println(num1 == num2);//false
        System.out.println(num1 != num2);//true
        System.out.println(num1 >= num2);//false
        System.out.println(num2 <= num1);//false


    }
}
