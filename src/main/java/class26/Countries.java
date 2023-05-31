package class26;

import java.util.Map;
import java.util.TreeMap;

/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop.
Print all values from a country map using for each loop and iterator.
*/
public class Countries {

    public static void main(String[] args) {

        Map<String, String> countries = new TreeMap<>();
        countries.put("Belarus", "Minsk");
        countries.put("France", "Paris");
        countries.put("Australia", "Canberra");
        countries.put("Canada", "Ottawa");
        countries.put("Germany", "Berlin");

        // Set<String> countrySet = countries.keySet();
        for (String c : countries.keySet()) {
            System.out.println(c);
        }
        System.out.println("======================");
        for (String v : countries.values()) {
            System.out.println(v);
        }

      //for(Map.Entry<String,String>e:
        for (var e : countries.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }


    }
}
