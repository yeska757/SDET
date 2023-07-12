package class17;

public class Cat {

    /*
    Cat(){

    }
    ----when we don't create constructor, java creates one for us---> default constructor(no parameters)
    */
    String name;

    Cat(String catName) {
        catName = name;
        System.out.println("1 argument constructor called");
    }

    Cat(String name, String color) {
        System.out.println("2 argument constructor is called");
    }

    Cat() {
        System.out.println("0 argument constructor called");
    }

    Cat(int age) {
        System.out.println("int argument constructor");
    }

    Cat(double weight) {
        System.out.println("double argument constructor");
    }

    void printInfo() {
        System.out.println(name);
    }


    public static void main(String[] args) {

        Cat cat = new Cat("Biscuit");
        cat.printInfo();
    }
}
