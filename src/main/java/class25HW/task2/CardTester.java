package class25HW.task2;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {

        Card visa = new Card(4.2, "visa");
        Card mc = new Card(6.9, "Master Card");
        Card ae = new Card(1.5, "American Express");

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(visa);
        cards.add(mc);
        cards.add(ae);

        for (Card card : cards) {
            System.out.println(card.cardType + " has an interest rate of " + card.interestRate);
        }


    }
}
