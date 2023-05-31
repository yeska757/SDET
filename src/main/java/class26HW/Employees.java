package class26HW;

/*
2)Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
        John Smith=$100000
*/

import java.util.HashMap;
import java.util.Map;

public class Employees {
    public static void main(String[] args) {

        Map<String, Integer> emp = new HashMap<>();
        emp.put("John Smith", 420690);
        emp.put("Naomi Johnson", 321600);
        emp.put("Liam Franko", 852849);
        emp.put("Zola Xomba", 69800);

        int highest = 0;
        for (Integer value : emp.values()) {
            if (value > highest) {
                highest = value;
            }
        }
        for (Map.Entry<String, Integer> e : emp.entrySet()) {
            if (e.getValue() == highest) {
                System.out.println(e.getKey() + "=$" + highest);
            }
        }


    }
}
