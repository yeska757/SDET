package groupProject2.task8;

//if the length of sedan is >20 feet, then the returned car price should include 5% discount, otherwise 10% discount
public class Sedan extends Car {

    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            carPrice = carPrice - (carPrice / 100 * 5);
        } else {
            carPrice = carPrice - (carPrice / 100 * 10);
        }
        System.out.println("Sedan adjusted sale price : ");
        return carPrice;
    }
}
