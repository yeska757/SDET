package groupProject2.task9;

/*
9. Create a Registration Class in which you would have variables as
        email, userName and password that have an access scope only within its own class.
        After creating an object of the class, user should be able to call methods
        and in each method separately pass values to set users email, username, and password.
        Requirements:
        A. Valid email considered to be only yahoo
        B. Valid userName and password cannot be empty and should be of
        length larger than 6 characters. Also, a valid password cannot contain a userName.
*/

public class Registration {

    private String email;
    private String userName;
    private String password;


    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
            System.out.println("Email is saved successfully");
        } else {
            System.out.println("Email must be yahoo");
        }
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
            System.out.println("UserName is saved successfully");
        } else {
            System.out.println("UserName must not be empty and over 6 characters");
        }
    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.equals(userName)) {
            this.password = password;
            System.out.println("Password is saved successfully");
        } else {
            System.out.println("Password must not be empty and over 6 characters.");
            System.out.println("Password can not contain userName");
        }
    }


}
