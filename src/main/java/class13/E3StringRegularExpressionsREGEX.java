package class13;

public class E3StringRegularExpressionsREGEX {
    public static void main(String[] args) {

        String str = "asdfghjQWERTYUIOP12   34567890!@#$%^&*()";

        System.out.println(str);
        System.out.println(str.replaceAll("[^a-z]",""));  // ^ -->means NOT (replaces everything but..)
        System.out.println(str.replaceAll("[^a-z0-9]",""));  // ^ -->means NOT (replaces everything but..)
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));  // ^ -->means NOT (replaces everything but..)
        System.out.println(str.replaceAll("[Wd3]",""));  // can just list what to replace
        System.out.println(str.replaceAll("[A-Z]","\\$"));  // $ will give an error unless \\$ before
        System.out.println(str.replaceAll(" ","\\$"));  // $ will give an error unless \\$ before










    }
}
