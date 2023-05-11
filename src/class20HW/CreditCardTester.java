package class20HW;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        System.out.println(creditCard.calculateInterest(420.69, 4.2));

        Visa visa = new Visa();
        System.out.println(visa.calculateInterest(69.42, 6.9));


        AX ax = new AX();
        System.out.println(ax.calculateInterest(25000, 4.5));


    }

}