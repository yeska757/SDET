package class21;
/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
            Define some methods specific to child classes
            Write example of achieving run time polymorphism
*/

public class Student {


    void eat() {
        System.out.println("Student eats");
    }

    void study() {
        System.out.println("Student studies");
    }

    void inPerson() {
        System.out.println("Student takes in person classes");
    }


}

class SyntaxStudent extends Student {
    @Override
    void study() {
        System.out.println("Syntax students study 5 days a week");
    }

    @Override
    void inPerson() {
        System.out.println("Syntax student takes online classes");
    }

    void chat() {
        System.out.println("Syntax students have a chat");
    }
}


class CollegeStudent extends Student {
    @Override
    void eat() {
        System.out.println("College students don't eat much because they are poor");
    }

    @Override
    void inPerson() {
        System.out.println("College student can have online and in person classes");
    }


}


class SchoolStudent extends Student {
    @Override
    void eat() {
        System.out.println("School students eat parents cooked food");
    }

    @Override
    void study() {
        System.out.println("School students don't study as much as they will in future");
    }

    void fight() {
        System.out.println("School kids get in trouble");
    }
}