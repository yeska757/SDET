package class25;

import java.util.ArrayList;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {

        Headset headset1 = new Headset("Razer Nari Ultimate", 79.99, 4620);
        Headset headset2 = new Headset("New SteelSeries Arctis", 52.68, 4868);
        Headset headset3 = new Headset("HyperC Cloud II", 79.99, 32116);

        List<Headset> headsets = new ArrayList<>();
        headsets.add(headset1);
        headsets.add(headset2);
        headsets.add(headset3);

         printList(headsets);   // gets headsets form overridden to
        //System.out.println(headsets);


    }

    public static void printList(List<Headset> headsets) {
        for (Headset head : headsets) {
            head.printInfo();
        }
    }

}

class Headset {

    private String title;
    private double price;
    private int noOfReviews;

    public Headset(String title, double price, int noOfReviews) {
        this.title = title;
        this.price = price;
        this.noOfReviews = noOfReviews;
    }

    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return title + " " + price + " " + noOfReviews;
    }



}