package class25;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Collection;
import java.util.TreeMap;

public class E10Maps {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipstick", 100.0);
        makeup.put("Blush", 68.0);
        makeup.put("EyeLiner", 80.0);
        makeup.put("Foundation", 120.0);
        makeup.put("Base", 25.00);

        System.out.println(makeup);

        Collection<Double> values = makeup.values();
        values.removeIf(v -> v > 80);
        System.out.println(makeup);

        XSSFWorkbook xssfWorkbook;


    }
}
