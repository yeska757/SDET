package class24;

import java.util.ArrayList;
import java.util.List;

public class E14ArrayList {
    public static void main(String[] args) {

        List<Integer> names = new ArrayList<>();
        names.add(10);//0
        names.add(20);//1
        names.add(44);//2
        names.add(50);//3
        names.add(100);//4
        System.out.println(names);
        names.add(1,500);  //insert 500 at index 1
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
        
    }
}
