package class21;

public class StudentPoly {
    public static void main(String[] args) {

        Student[] student = {new SyntaxStudent(),
                new CollegeStudent(),
                new SchoolStudent()};

        for (Student students : student) {
            if (students instanceof SyntaxStudent) {
                ((SyntaxStudent) students).chat();
            } else if (students instanceof SchoolStudent) {
                ((SchoolStudent) students).fight();
            }
            students.eat();
            students.study();
            students.inPerson();
        }


    }
}
