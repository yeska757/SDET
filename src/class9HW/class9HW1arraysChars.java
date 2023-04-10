package class9HW;

public class class9HW1arraysChars {
    public static void main(String[] args) {

        //Create an array of chars and store grades into it: A,B,C,D.
        //Then print a grade B (use 2 different ways of creating an array).

        char[] grades = {'A', 'B', 'C', 'D'};
        System.out.println(grades[1]);

        //or

        char[] gradess = new char[4];
        gradess[0] = 'A';
        gradess[1] = 'B';
        gradess[2] = 'C';
        gradess[3] = 'D';
        System.out.println(gradess[1]);


    }
}
