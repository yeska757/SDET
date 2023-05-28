package groupProject2.task7;

public class B extends Marks {

    double science;

    B(double math, double eng, double chem, double science) {
        super(math, eng, chem);
        this.science = science;
    }

    @Override
    public double getPercentage() {
        System.out.println("Average of 4 marks for student B : ");
        return (math + eng + chem + science) / 4;
    }
}
