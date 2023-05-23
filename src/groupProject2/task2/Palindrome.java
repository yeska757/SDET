package groupProject2.task2;

/*
2. Check if a String is Palindrome: Determine whether a given string is
        a palindrome, which means it reads the same forwards and backward.
        For example, "madam" is a palindrome.
*/
public class Palindrome {
    public static void main(String[] args) {

        String given = "madam";

        StringBuilder reverse = new StringBuilder(given);
        String reverced = reverse.reverse().toString();
        if (given.equals(reverced)) {
            System.out.println(given + " is a Palindrome");
        } else {
            System.out.println(given + " is not a Palindrome");
        }

    }
}
