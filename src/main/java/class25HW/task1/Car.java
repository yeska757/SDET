package class25HW.task1;

public class Car extends Insurance {

    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }


    @Override
    public void getQuote() {
        System.out.println("Car insurance quote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Car insurance cancelled");
    }
}
