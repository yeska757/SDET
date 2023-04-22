package class12;

public class E1StringClass {
    public static void main(String[] args) {

        // create the object of that class
        // Scanner scan = new Scanner(System.in)     <----same syntax
        // ClassName  objectName = new ClassName();
        String s = new String("Zheka");
        String string1 = "Zheka";  // Most widely used
        System.out.println(string1.length());  // The 5 means there are 5 letters in Zheka

        String name = "Justin Chukwudiuche";
        if (name.length() > 8) {
            System.out.println("Only 8 characters are allowed");
        }


    }
}
