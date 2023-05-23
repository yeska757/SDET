package groupProject2.task8;

/*
8. Create a Class Car that would have the following fields:
        carPrice and color and method calculateSalePrice() which should be returning the price of the car.
        Create 2 sub classes: Sedan and Truck.
        The Truck class has a field as weight and has its own implementation of calculateSalePrice() method
        in which returned price is calculated as following:
        if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
        The Sedan class has field as length and also does it its own implementation of calculateSalePrice():
        if the length of sedan is >20 feet, then the returned car price should include 5% discount, otherwise 10% discount
*/

public abstract class Car {

    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public abstract double calculateSalePrice();


}
