package class26HW;

/*
3) Create the collection that will store single uniques Objects of a String type in which order is preserved.
        Write a logic to concatenate all string from the collection.
*/

import java.util.LinkedHashSet;
import java.util.Set;

public class Unique {
    public static void main(String[] args) {

        Set<String> obj = new LinkedHashSet<>();
        obj.add("I");
        obj.add("Like");
        obj.add("Java");
        obj.add("Class");

        StringBuilder concat = new StringBuilder();
        for (String s : obj) {
            concat.append(s);
        }
        System.out.println(concat.toString());


    }
}
