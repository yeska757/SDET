package class28HW;

/*
Create a method to check age eligibility that will throw a runtime exception.
    Method should throw an exception age is less than 16.
*/
public class Task1 {

    public static void checkAgeEligibility(int age) {
        if (age < 16) {
            throw new RuntimeException("Not eligible. Age is under 16.");
        }
    }

    public static void main(String[] args) {

        checkAgeEligibility(14);

    }
}
