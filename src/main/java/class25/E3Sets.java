package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {

        ArrayList<String>names = new ArrayList<>();
        names.add("Biscuit");
        names.add("Biscuit");
        System.out.println(names.get(0));
        System.out.println(names);

        HashSet<String>uniqueNames = new HashSet<>();
        uniqueNames.add("Zheka");
        uniqueNames.add("Masha");
        uniqueNames.add("Biscuit");  // does not maintain order
        uniqueNames.add("Zheka");   //ignores duplicates
       // System.out.println(uniqueNames.get(0)); ----> no get method in Sets
        System.out.println(uniqueNames);
        for (String name : uniqueNames) {
            System.out.println(name);
        }





    }
}
