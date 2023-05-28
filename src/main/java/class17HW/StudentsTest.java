package class17HW;

public class StudentsTest {
    public static void main(String[] args) {

        Students student1 = new Students("Stu1", 99.9, 88.8, 77.7);
        System.out.println("Average mark of " + student1.studentName + " : " + student1.averageGrade());

        Students student2 = new Students("Stu2", 88.8, 77.7, 66.6);
        System.out.println("Average mark of " + student2.studentName + " : " + student2.averageGrade());

        Students student3 = new Students("Stu3", 77.7, 66.6, 55.5);
        System.out.println("Average mark of " + student3.studentName + " : " + student3.averageGrade());

        Students student4 = new Students("Stu4", 66.6, 55.5, 44.4);
        System.out.println("Average mark of " + student4.studentName + " : " + student4.averageGrade());

        Students student5 = new Students("Stu5", 98.76, 87.65, 76.54);
        System.out.println("Average mark of " + student5.studentName + " : " + student5.averageGrade());
    }
}
