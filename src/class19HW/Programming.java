package class19HW;

public class Programming {
   /* Create a class named 'Programming'.
        While creating an object of the class, if nothing is passed to it,
        then the message "I love programming languages" should be printed.
        If some String is passed to it, then in place of "programming languages"
        the value variable should be printed.
        For Example, if we pass "Java", then "I love Java" should be printed.
*/

    String programming() {
        return "I love programming languages";
    }

    String programming(String str) {
        return "I love " + str;
    }


}
