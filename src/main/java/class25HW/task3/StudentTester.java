package class25HW.task3;

//Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order.
// Each student object should have name and studentID. Display name of each student.

import java.util.HashSet;

public class StudentTester {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();

        students.add(new Student("John", "A135"));
        students.add(new Student("Cate", "B246"));
        students.add(new Student("Leon", "C357"));

        for (Student student : students) {
            System.out.println(student.name);
        }


    }
}
