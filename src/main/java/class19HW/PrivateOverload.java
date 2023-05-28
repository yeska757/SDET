package class19HW;

public class PrivateOverload {
   /* Create 1 class with a private method that has 3 overloaded forms.
        Then call each overloaded method with specific arguments and observe the result.
*/

    private void printInfo(String name) {
        System.out.println(name);
    }

    private void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    private void printInfo(String name, int age, int grade) {
        System.out.println(name + " " + age + " " + grade);
    }


    public static void main(String[] args) {
        PrivateOverload overload = new PrivateOverload();
        overload.printInfo("Zheka");
        overload.printInfo("Zheka", 29);
        overload.printInfo("Zheka", 29, 100);
    }


}
