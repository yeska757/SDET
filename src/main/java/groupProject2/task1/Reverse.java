package groupProject2.task1;

/*
1. Reverse a String: Write a function to reverse a given string. For
        example, given the input "Hello", the output should be "olleH".
*/
public class Reverse {

    public void revStr(String given) {
        StringBuilder reverse = new StringBuilder(given);
        System.out.println(reverse.reverse().toString());
    }

}
