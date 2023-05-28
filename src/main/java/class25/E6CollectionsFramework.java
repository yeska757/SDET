package class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class E6CollectionsFramework {
    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Banana");

        HashSet<String>hashSet = new HashSet<>(fruit);
        System.out.println(hashSet);

        LinkedList<String>linkedList = new LinkedList<>(hashSet);
        System.out.println(linkedList);

        TreeSet<String> treeSet = new TreeSet<>(fruit);
        System.out.println(treeSet);


    }
}
