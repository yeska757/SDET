package class25;

import java.util.LinkedHashSet;

//Create a Set of cities in which you want to make sure that insertion order is maintained.
// Then remove any city that starts with “A”;
public class Order {
    public static void main(String[] args) {

        LinkedHashSet<String> city = new LinkedHashSet<>();
        city.add("Minsk");
        city.add("Gomel");
        city.add("Brest");
        city.add("Hrodna");
        city.add("Antopal");
        city.add("Mogilev");
        city.add("Vitebsk");
        city.add("Astravyets");
        city.add("Baranovichi");

        System.out.println(city);

        city.removeIf(a -> a.startsWith("A"));
        System.out.println(city);


    }
}
