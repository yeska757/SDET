package class17HW;

public class Students {
  /*  Write a java Class Students that have a constructor which takes student's name and 3 subject grades.
        Inside your class also have a method to Calculate Average Grade.
        Test Student class for 5 different students with different marks.
        Your program should print an average mark of each student's name.
   */

    String studentName;
    double javaGrade;
    double manualGrade;
    double gitGrade;


    public Students(String studentName, double javaGrade, double manualGrade, double gitGrade) {
        this.studentName = studentName;
        this.javaGrade = javaGrade;
        this.manualGrade = manualGrade;
        this.gitGrade = gitGrade;
    }

    double averageGrade() {
        return (javaGrade + manualGrade + gitGrade) / 3;
    }
}
