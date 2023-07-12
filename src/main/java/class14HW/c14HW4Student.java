package class14HW;

public class c14HW4Student {

    /*Create  class Student that will have a method getGrade.
    Your method should accept the score of a student and return a grade:
    score > 90 - A
    score >80 - B
    score >70 - C
    score > 50 - D
    anything else - F*/

    char grade(int score) {
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        c14HW4Student student = new c14HW4Student();
        System.out.println(student.grade(99));
    }


}
