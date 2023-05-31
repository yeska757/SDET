package class26;

/*
Create a map of Best Buy store. Place
        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet.
*/

import java.util.HashMap;
import java.util.Map;

public class BestBuy {
    public static void main(String[] args) {

        Map<Integer, String> items = new HashMap<>();
        items.put(12345, "TV");
        items.put(23456, "Printer");
        items.put(34567, "Speaker");
        items.put(45678, "Fridge");
        items.put(56789, "Scanner");

        for (var item : items.entrySet()) {
            System.out.println(item.getKey() + " = " + item.getValue());
        }


    }
}
