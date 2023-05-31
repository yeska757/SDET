package class26HW;

/*
Create a Person class with the following private fields: name, lastName, age, salary.
        Variables should be initialized through constructor.
        Inside the class also create a method to print user details.
*/

public class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printUserDetails() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
