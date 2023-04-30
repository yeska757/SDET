package class14HW;

public class c14HW2createEmail {

  /*  Create a method createEmail().
    Based on values of users firstName, lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
   */

    String createEmail(String firstName, String lastName, String domain) {
        return firstName + lastName + '@' + domain + ".com";
    }


    public static void main(String[] args) {
        c14HW2createEmail email = new c14HW2createEmail();
        System.out.println(email.createEmail("yauheniya", "sanko", "gmail"));
    }


}
