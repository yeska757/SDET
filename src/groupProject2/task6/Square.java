package groupProject2.task6;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        System.out.println("Area of square : ");
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Perimeter of square : ");
        return 4 * side;
    }
}
