package class24;

import java.util.ArrayList;
import java.util.Iterator;


public class E10ArrayListTask {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("coke");
        names.add("cofee");
        names.add("water");
        names.add("juice");

        Iterator<String> iterator = names.iterator();

       /* while(iterator.hasNext()){
            String word = iterator.next();
            if (word.endsWith("e")){
                iterator.remove();
            }
        }*/
        names.removeIf(word -> word.endsWith("e"));
        System.out.println(names);


    }
}
