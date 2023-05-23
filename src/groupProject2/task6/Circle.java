package groupProject2.task6;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        System.out.println("Area of circle : ");
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Perimeter of circle : ");
        return 2 * Math.PI * radius;
    }
}
