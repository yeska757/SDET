package class15HW;

import java.util.Set;

public class StudentsHW {
    /*Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students*/

    String name;
    String iD;
    static String numberOfStudents;

    public static void main(String[] args) {
        int numberOfStudents = 0;

        StudentsHW stu1 = new StudentsHW();
        stu1.name = "Zheka";
        stu1.iD = "ST000111";
        numberOfStudents++;

        StudentsHW stu2 = new StudentsHW();
        stu1.name = "Masha";
        stu1.iD = "ST000112";
        numberOfStudents++;

        StudentsHW stu3 = new StudentsHW();
        stu1.name = "Biscuit";
        stu1.iD = "ST000113";
        numberOfStudents++;

        System.out.println("Number of Students: " + numberOfStudents);
    }

}
