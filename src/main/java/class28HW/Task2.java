package class28HW;

/*
Create a method checkUserName that will throw a runtime exception.
    Method should throw an exception when entered username is less than 5 characters.
*/

public class Task2 {

    public static void checkUserName(String userName) {
        if (userName.length() < 5) {
            throw new RuntimeException("Entered username is less than 5 characters");
        }
    }

    public static void main(String[] args) {

        checkUserName("gendosik2");
        checkUserName("yes");

    }
}
