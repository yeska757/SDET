package class13;

public class E2StringReplaceAll {
    public static void main(String[] args) {

        String str = "nskaaljfDHJBJHF13561475!@#$%^";
        System.out.println(str.replaceAll("[a-z]", "*"));  //replaced all low case with *
        System.out.println(str.replaceAll("[A-Z]", "#")); //replaced all UPPER case with #
        System.out.println(str.replaceAll("[0-9]", "%")); //replaced all numbers case with %
        System.out.println(str.replaceAll("[a-z0-9]", "%")); //replaced all low case & numbers case with %
        System.out.println(str.replaceAll("[a-zA-Z]", "%")); //replaced all low case & UPcase case with %
        System.out.println(str.replaceAll("[a-k]", "*")); //replaced all low case from a-k case with *
        //used ASCII table for range
        System.out.println(str.replaceAll("[#-z]", "*")); //replaced all from # to lowcase z


    }
}
