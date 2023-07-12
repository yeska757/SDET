package class21;

public class Parent {
    final int noOfMonthsInYear = 12;

    final void getMarry() {
        // noOfMonthsInYear = 13;     ------> can not change when final
        System.out.println("Marry Shakira");
    }

    void study() {
        System.out.println("Study medicine");
    }
}

class Axel extends Parent {

    /* @Override     ---------> can NOT override final
     void getMarry() {
         System.out.println("Karol G");
     }
 */
    @Override
    void study() {
        System.out.println("No I want to study SDET");
    }
}