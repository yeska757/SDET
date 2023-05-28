package class25HW.task1;

public class Health extends Insurance {

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Health insurance quote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Health insurance cancelled");
    }
}
