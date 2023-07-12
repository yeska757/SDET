package class26;

/*
Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map
*/

import org.apache.commons.collections4.map.LinkedMap;

import java.util.Map;

public class Building {
    public static void main(String[] args) {

        Map<Integer, String> building = new LinkedMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Best Buy");
        building.put(4, "Apple");
        building.put(5, "Samsung");
        building.put(5, "Samsung");
        building.put(6, "LG");
        building.put(7, "Amazon");

        System.out.println(building);
        System.out.println(building.size());
        building.replace(4, "Facebook");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);


    }
}
