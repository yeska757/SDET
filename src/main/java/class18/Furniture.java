package class18;

public class Furniture {
    String color = "Black";
}

class Chair extends Furniture {
    String color = "White";

    void printColor() {
        String color = "blue";
        System.out.println(color);//takes local
        System.out.println(this.color);   //this.takes instance
        System.out.println(super.color);//super.-->takes from parent class

    }
}

class FurnitureTester {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
    }
}
