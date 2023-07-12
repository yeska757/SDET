package class24;

import java.util.ArrayList;

/*Create an ArrayList that will store 5 names into it.
        Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that*/
public class E8ArrayListTask {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Yeska");
        names.add("Biscuit");
        names.add("Masha");
        names.add("Maryna");
        names.add("Aleh");


        System.out.println(names.isEmpty());
        System.out.println(names.contains("Biscuit"));
        System.out.println(names.size());
        System.out.println(names);


    }
}
