package class13HW;

public class cl13HW2palindrome {
    public static void main(String[] args) {

       /* How would you check if String is palindrome or not? aba=> true
        Abbc =>false*/

        String str = "Racecar";
        StringBuilder revStr = new StringBuilder(str).reverse();

        String revString = revStr.toString();

        System.out.println(str.equalsIgnoreCase(revString));


    }
}
