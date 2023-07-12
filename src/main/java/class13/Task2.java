package class13;

public class Task2 {
    public static void main(String[] args) {

        String str = "Biscuit757!@#";
        String str1 = str.replaceAll("[^A-Za-z]", "");
        System.out.println(str1.length());


    }
}
