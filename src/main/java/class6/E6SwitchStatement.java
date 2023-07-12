package class6;

public class E6SwitchStatement {
    public static void main(String[] args) {

        char gender = 'F';

        switch (gender) {     ////only works with int, String, short, byte
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case 'O':
                System.out.println("Others");
                break;
            default:
                System.out.println("Char not spotted");
        }

    }
}
