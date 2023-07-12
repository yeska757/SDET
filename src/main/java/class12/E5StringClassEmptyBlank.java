package class12;

public class E5StringClassEmptyBlank {
    public static void main(String[] args) {

        String name = "     ";
        System.out.println(name.isEmpty()); // it only checks characters, NOT SPACES
        System.out.println(name.isBlank()); //it checks spaces too


    }
}
