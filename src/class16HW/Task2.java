package class16HW;

public class Task2 {
  /*  Create a method that will accept a String as a parameter
        and return a new String that consist only of vowels.
        Method should be available inside the class only where it was declared
        and executed by calling it is name.
   */

    private String vowels(String str) {
        String vow = str.replaceAll("[^aeiouAEIOU]", "");
        return vow;
    }

    public static void main(String[] args) {
        Task2 print = new Task2();
        String vowelsOnly = print.vowels("Every day I like to play with JAVA");
        System.out.println(vowelsOnly);
    }
}
