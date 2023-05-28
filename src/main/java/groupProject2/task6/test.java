package groupProject2.task6;

public class test {
    public static void main(String[] args) {

        Shape[] shapes = {new Circle(4.20), new Square(6.9)};
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
        }


    }
}
