package class16;

public class Person {

    String SSN = "1234567899";
    // default -- can be accessed in same class and same package
    // private -- can be shared only within same class
    // public -- can be accessed anywhere within project

    public String name = "Biscuit";
    private String password;
    private static double bankBalance = 12000;


    private void printPassword(){
        System.out.println(password);
    }

    private static void printBalance(){   //only accessed in same class
        System.out.println(bankBalance);
    }

    public static void main(String[] args) {
        Person zheka = new Person();
        zheka.password = "12345";
        zheka.printPassword();
        System.out.println(Person.bankBalance);
        System.out.println(zheka.name);
    }
}

