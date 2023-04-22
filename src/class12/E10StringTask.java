package class12;

import java.util.Scanner;

public class E10StringTask {
    public static void main(String[] args) {

       /* Store username, password and confirm password from a user and check following requirements:

        Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created”*/


        String username = "admin";
        String password = "Pass12345";
        String confirmPass = "Pass12345";


        if (username.isBlank() || password.isBlank()) {
            System.out.println("Username or Password cannot be empty");
        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.equals(username)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirmPass)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }


    }
}
