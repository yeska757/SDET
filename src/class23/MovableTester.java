package class23;

public class MovableTester {
    public static void main(String[] args) {

        Moveable movable = new Horse();
        Washable washable = new Dog();
        Moveable[] movables = {new Cat(), new Dog()};

        for (Moveable m : movables) {
            m.move();
        }

    }
}
