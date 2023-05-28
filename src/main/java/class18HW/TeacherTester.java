package class18HW;

public class TeacherTester {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("John Smith", 32, 10, true);
        teacher.teachClass();
        teacher.gradePapers();
        teacher.getYearsExperience();
        teacher.isCertified();

        MathTeacher math = new MathTeacher("Jessica Count", 29, 7, true);
        math.teachClass();
        math.gradePapers();
        math.getYearsExperience();
        math.isCertified();

        ChemistryTeacher chem = new ChemistryTeacher("Chemmy Stry", 45, 15, true);
        chem.teachClass();
        chem.gradePapers();
        chem.getYearsExperience();
        chem.isCertified();

        PianoTeacher piano = new PianoTeacher("Mus Ick", 22, 3, false);
        piano.teachClass();
        piano.gradePapers();
        piano.getYearsExperience();
        piano.isCertified();


    }
}
