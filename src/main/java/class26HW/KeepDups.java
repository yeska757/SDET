package class26HW;

/*
Create a collection of integers in which you can keep duplicates.
        Write a logic to find sum of all integers
*/

import java.util.ArrayList;
import java.util.List;

public class KeepDups {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        ints.add(100);
        ints.add(20);
        ints.add(30);
        ints.add(5);
        ints.add(245);
        ints.add(20);

        int sum = 0;
        for (Integer anInt : ints) {
            sum += anInt;
        }
        System.out.println(sum);


    }
}
