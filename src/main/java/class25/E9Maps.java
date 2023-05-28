package class25;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E9Maps {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipstick", 100.0);
        makeup.put("Blush", 100.0);
        makeup.put("EyeLiner", 80.0);
        makeup.put("Foundation", 120.0);
        makeup.put("Base", 25.00);

        System.out.println(makeup);

        Set<String> keys = makeup.keySet();
        keys.removeIf(x -> x.contains("a"));
        System.out.println(makeup);

        Collection<Double> values = makeup.values();
        System.out.println(values);

    }
}
