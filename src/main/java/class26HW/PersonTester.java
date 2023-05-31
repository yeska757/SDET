package class26HW;

import java.util.Map;
import java.util.TreeMap;

/*
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
*/
public class PersonTester {
    public static void main(String[] args) {

        Map<String, Person> ppl = new TreeMap<>();
        ppl.put("012345", new Person("Nick", "Smith", 33, 88000.00));
        ppl.put("23456", new Person("Kate", "Mars", 21, 98500.00));
        ppl.put("34567", new Person("Naomi", "Owen", 43, 76980.00));

        for (var s : ppl.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }

    }
}
