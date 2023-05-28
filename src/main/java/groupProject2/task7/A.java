package groupProject2.task7;

public class A extends Marks {


    A(double math, double eng, double chem) {
        super(math, eng, chem);
    }

    @Override
    public double getPercentage() {
        System.out.println("Average of 3 marks for student A : ");
        return (math + eng + chem) / 3;
    }
}
