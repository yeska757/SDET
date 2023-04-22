package class12;

public class E6StringClassEquals {
    public static void main(String[] args) {

        String name = "Justin";

        System.out.println(name.equals("Axel")); //false
        System.out.println(name.equals("Justin"));  //true
        System.out.println(name.equalsIgnoreCase("JUSTIN"));  //true -- ignores case
        System.out.println(!name.equalsIgnoreCase("JUSTIN"));  //false -- ignores case












    }
}
