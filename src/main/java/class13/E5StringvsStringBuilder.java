package class13;

public class E5StringvsStringBuilder {
    public static void main(String[] args) {

//string builder
        StringBuilder str = new StringBuilder("Java");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.reverse());

        String str1 = "Computer";
        StringBuilder str2 = new StringBuilder(str1);
        System.out.println(str2);
        str2.reverse();
        str1 = str2.toString();
        System.out.println(str1);


    }
}
