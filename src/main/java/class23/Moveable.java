package class23;

public interface Moveable {

    //  public static final ;   ---->by default
    int age = 12;

    void move();
}

interface Washable {
    void wash();
}

class Dog implements Moveable, Washable {

    @Override
    public void move() {
        System.out.println("Moving...");
    }

    @Override
    public void wash() {
        System.out.println("You can wash me");
    }
}

class Cat implements Moveable {
    @Override
    public void move() {
        System.out.println("Cats can also move");
    }
}

class Horse implements Moveable {
    public void move() {
        System.out.println("Cats can also move");
    }
}


