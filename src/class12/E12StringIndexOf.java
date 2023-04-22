package class12;

public class E12StringIndexOf {
    public static void main(String[] args) {

        String name = "Today is Saturday";

        System.out.println(name.indexOf('i'));  //6

        System.out.println(name.indexOf('a'));//3  prints first found

        System.out.println(name.indexOf('a', 4));  //10  'char',4(index at which starts)


    }
}
