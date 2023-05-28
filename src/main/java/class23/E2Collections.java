package class23;

import java.util.ArrayList;

public class E2Collections {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mocef");
        names.add("Vlad");
        names.add("Yeska");
        names.add("Masha");
        names.add("Biscuit");
        names.add("Adam");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Biscuit"));
        System.out.println(names.get(0));
        names.remove("Vlad");
        System.out.println(names);
        System.out.println(names.size());

        System.out.println(names.indexOf("Yeska"));
        //     names.clear();  // -----> clears all list
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


    }
}
