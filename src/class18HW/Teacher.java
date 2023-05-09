package class18HW;

public class Teacher {
 /*   Write a Java program called Teacher. Identify features and 4 behavior of that Class.
        Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher. Test all 4 classes.
  */


    String name;
    int age;
    int yearsExperience;
    boolean isCertified;


    public Teacher(String name, int age, int yearsExperience, boolean isCertified) {
        this.name = name;
        this.age = age;
        this.yearsExperience = yearsExperience;
        this.isCertified = isCertified;
    }

    public void teachClass() {
        System.out.println(name + " is " + age + " years old.");
    }

    public void gradePapers() {
        System.out.println(name + " is teaching " + yearsExperience + " years out of " + age + " years of life");
    }

    public void getYearsExperience() {
        System.out.println(name + " has an experience of " + yearsExperience + " years");
    }

    public void isCertified() {
        if (isCertified) {
            System.out.println("This teacher is certified.");
        } else {
            System.out.println("This teacher is not yet certified");
        }
    }

}

class MathTeacher extends Teacher {

    public MathTeacher(String name, int age, int yearsExperience, boolean isCertified) {
        super(name, age, yearsExperience, isCertified);
    }
}

class ChemistryTeacher extends Teacher {

    public ChemistryTeacher(String name, int age, int yearsExperience, boolean isCertified) {
        super(name, age, yearsExperience, isCertified);
    }
}

class PianoTeacher extends Teacher {

    public PianoTeacher(String name, int age, int yearsExperience, boolean isCertified) {
        super(name, age, yearsExperience, isCertified);
    }
}