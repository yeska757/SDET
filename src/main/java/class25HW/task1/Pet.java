package class25HW.task1;

public class Pet extends Insurance {

    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Quote for a pet");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Pet insurance cancelled");
    }
}
