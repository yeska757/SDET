package class25;

import java.util.TreeSet;

public class SortedAlph {
    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();
        countries.add("Belarus");
        countries.add("Russia");
        countries.add("France");
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Ukraine");

        System.out.println(countries);
        for (String country : countries) {
            System.out.println(country);
        }


    }
}
