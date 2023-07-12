package class19HW;

public class StaticOverload {

    /*Create 1 class with a static method that has 3 overloaded forms.
        Then call each overloaded method with specific arguments and observe the result.
    */

    static int calculateAvgGrade(int grade1, int grade2) {
        return (grade1 + grade2) / 2;
    }

    static int calculateAvgGrade(int grade1, int grade2, int grade3) {
        return (grade1 + grade2 + grade3) / 3;
    }

    static int calculateAvgGrade(int grade1, int grade2, int grade3, int grade4) {
        return (grade1 + grade2 + grade3 + grade4) / 4;
    }

    public static void main(String[] args) {
        System.out.println(calculateAvgGrade(98, 87));
        System.out.println(calculateAvgGrade(87, 76, 65));
        System.out.println(calculateAvgGrade(65, 54, 43, 99));
    }
}
