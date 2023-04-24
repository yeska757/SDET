package class13;

public class Task1 {
    public static void main(String[] args) {

        //   Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        String str = "   I'm eating icecream        ";
        System.out.println(str.replaceAll("[ ]", ""));


    }
}
