package class26;

import java.util.HashSet;
import java.util.Set;

public class EntrySetTester {

    public static void main(String[] args) {

        Set<Entry> entrySet = new HashSet<>();
        entrySet.add(new Entry("Coke", 2.0));
        entrySet.add(new Entry("Milk", 5.0));
        entrySet.add(new Entry("Mango juice", 2.5));

      /*  for (Entry e : entrySet) {
            if(e.getKey().contains("i")&&e.getValue()>2){
                System.out.println(e.getKey());
                System.out.println(e.getValue());
                System.out.println(e.getKey() + e.getValue());
            }
        }
*/
        entrySet.removeIf(x->x.getKey().contains("i")&&x.getValue()>2);
        System.out.println(entrySet);


    }
}
