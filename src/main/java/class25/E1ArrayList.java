package class25;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda", "Mazda3");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("BMW", "M5");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for (Car car : cars) {
            car.printInfo();
        }


    }
}

class Car {
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void printInfo() {
        System.out.println(make + " " + model);
    }
}