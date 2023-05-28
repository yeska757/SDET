package groupProject2.task8;

// if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.

public class Truck extends Car {

    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            carPrice = carPrice - (carPrice / 100 * 10);
        } else {
            carPrice = carPrice - (carPrice / 100 * 20);
        }
        System.out.println("Truck adjusted sale price : ");
        return carPrice;
    }
}
